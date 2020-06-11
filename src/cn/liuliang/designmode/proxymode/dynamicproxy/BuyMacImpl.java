package cn.liuliang.designmode.proxymode.dynamicproxy;

/**
 * 买电脑的具体实现类
 *
 * @author liuliang-刘亮
 * @date 2020/6/11 - 10:03
 */
public class BuyMacImpl implements IBuyMac {
    @Override
    public void buyMac(String name) {
        System.out.println("我正在买mac电脑，电脑名是：" + name);
    }
}
