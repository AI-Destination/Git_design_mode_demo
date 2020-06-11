package cn.liuliang.designmode.proxymode.dynamicproxy;

/**
 * @author liuliang-刘亮
 * @date 2020/6/11 - 10:47
 */
public class JdkProxyBuyMacInterfaceFactory {

    private static JdkProxyBuyMacInterface jdkProxyBuyMacInterface = null;

    public static Object getObjectProxy(Class<?> aClass) {
        if (jdkProxyBuyMacInterface == null) {
            synchronized (JdkProxyBuyMacInterfaceFactory.class) {
                if (jdkProxyBuyMacInterface == null) {
                    jdkProxyBuyMacInterface = new JdkProxyBuyMacInterface();
                }
            }
        }
        return jdkProxyBuyMacInterface.getInstance(aClass);
    }
}
