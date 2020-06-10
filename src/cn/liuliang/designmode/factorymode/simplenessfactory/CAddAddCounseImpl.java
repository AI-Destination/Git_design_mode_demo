package cn.liuliang.designmode.factorymode.simplenessfactory;

/**
 * C++相关授课方式
 *
 * @author liuliang-刘亮
 * @date 2020/6/10 - 9:14
 */
public class CAddAddCounseImpl implements ICourse {
    @Override
    public void giveLessons() {
        System.out.println("C++授课方法");
    }
}
