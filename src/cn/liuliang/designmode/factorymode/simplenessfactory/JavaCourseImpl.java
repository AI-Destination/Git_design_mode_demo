package cn.liuliang.designmode.factorymode.simplenessfactory;

/**
 * Java相关内容的授课
 *
 * @author liuliang-刘亮
 * @date 2020/6/10 - 9:13
 */
public class JavaCourseImpl implements ICourse {
    @Override
    public void giveLessons() {
        System.out.println("这是Java授课方法");
    }
}
