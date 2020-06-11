package cn.liuliang.designmode.proxymode.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 基于JDK代理的方法类，直接代理接口
 *
 * @author liuliang-刘亮
 * @date 2020/6/11 - 10:26
 */
public class JdkProxyBuyMacInterface implements InvocationHandler {

    /**
     * 代理接口的class对象
     */
    private Class<?> aClass;

    /**
     * 获取代理对象
     *
     * @param aClass 要代理的class对象
     * @return 代理对象
     */
    public Object getInstance(Class<?> aClass) {
        if (aClass == null) {
            throw new RuntimeException("代理接口class不为空");
        }
        this.aClass = aClass;
        return Proxy.newProxyInstance(
                this.aClass.getClassLoader(),
                new Class[]{this.aClass},
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //因为代理的是接口，没有实现类，所以具体的实现逻辑都要在这里实现
        System.out.println("我正在买mac电脑，电脑名是：" + Arrays.asList(args));
        return null;
    }
}
