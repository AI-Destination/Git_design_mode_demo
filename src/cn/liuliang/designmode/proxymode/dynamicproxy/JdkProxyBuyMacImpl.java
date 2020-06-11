package cn.liuliang.designmode.proxymode.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于JDK代理的方法类，代理实现类
 *
 * @author liuliang-刘亮
 * @date 2020/6/11 - 10:05
 */
public class JdkProxyBuyMacImpl implements InvocationHandler {

    /**
     * 定义一个代理对象
     */
    private Object obj;

    public Object getInstance(Object object) {
        this.obj = object;
        //返回代理实例
        return Proxy.newProxyInstance(
                this.obj.getClass().getClassLoader(),
                this.obj.getClass().getInterfaces(),
                this);
    }

    /**
     * 代理方法执行的具体逻辑
     *
     * @param proxy  代理对象信息，一般用不到
     * @param method 代理方法
     * @param args   参数
     * @return 代理对象执行方法的返回值
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行方法，这期间可以对方法增强
        return method.invoke(this.obj, args);
    }
}
