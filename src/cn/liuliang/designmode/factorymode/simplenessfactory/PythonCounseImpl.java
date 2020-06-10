package cn.liuliang.designmode.factorymode.simplenessfactory;

/**
 * Python相关授课方式
 *
 * @author liuliang-刘亮
 * @date 2020/6/10 - 9:14
 */
public class PythonCounseImpl implements ICourse {
    @Override
    public void giveLessons() {
        System.out.println("python授课方法");
    }
}
