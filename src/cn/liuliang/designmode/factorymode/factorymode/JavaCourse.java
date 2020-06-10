package cn.liuliang.designmode.factorymode.factorymode;

/**
 * @author liuliang-刘亮
 * @date 2020/6/10 - 12:16
 */
public class JavaCourse implements ICourse {
    @Override
    public void giveLessons() {
        System.out.println("Java授课方法");
    }
}
