package cn.liuliang.designmode.factorymode.factorymode;

/**
 * @author liuliang-刘亮
 * @date 2020/6/10 - 12:17
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse getCourse() {
        return new JavaCourse();
    }
}
