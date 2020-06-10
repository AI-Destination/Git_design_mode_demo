package cn.liuliang.designmode.factorymode.abstractionfactory;

/**
 * 黑马培训机构授课工厂
 *
 * @author liuliang-刘亮
 * @date 2020/6/10 - 13:22
 */
public class HeiMaCourseFactory implements AbstractionFactory {
    @Override
    public IJavaCourse getJavaCourse() {
        return new JavaCourseImpl();
    }

    @Override
    public IPythonCourse getPythonCourse() {
        return new PythonCourseImpl();
    }
}
