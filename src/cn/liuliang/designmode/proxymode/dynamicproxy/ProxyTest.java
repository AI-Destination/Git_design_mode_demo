package cn.liuliang.designmode.proxymode.dynamicproxy;

/**
 * @author liuliang-刘亮
 * @date 2020/6/11 - 10:16
 */
public class ProxyTest {
    public static void main(String[] args) {
        System.out.println("基于jdk代理的类");
        JdkProxyBuyMacImpl jdkProxyBuyMac = new JdkProxyBuyMacImpl();
        IBuyMac iBuyMac = (IBuyMac) jdkProxyBuyMac.getInstance(new BuyMacImpl());
        iBuyMac.buyMac("小米");

        System.out.println("基于jdk代理的接口");
        JdkProxyBuyMacInterface jdkProxyBuyMacInterface = new JdkProxyBuyMacInterface();
        IBuyMac iBuyMac02 = (IBuyMac) jdkProxyBuyMacInterface.getInstance(IBuyMac.class);
        iBuyMac02.buyMac("华为");

        System.out.println("基于jdk代理的接口，工厂获取代理接口对象");
        IBuyMac iBuyMac03 = (IBuyMac) JdkProxyBuyMacInterfaceFactory.getObjectProxy(IBuyMac.class);
        iBuyMac03.buyMac("联想");
    }
}
