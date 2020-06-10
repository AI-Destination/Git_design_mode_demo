package cn.liuliang.designmode.factorymode.abstractionfactory;

/**
 * 尚硅谷培训基地授课工厂
 *
 * @author liuliang-刘亮
 * @date 2020/6/10 - 13:20
 */
public class SangGuiGuCourseFactory implements AbstractionFactory {
    @Override
    public IJavaCourse getJavaCourse() {
        return new JavaCourseImpl();
    }

    @Override
    public IPythonCourse getPythonCourse() {
        return new PythonCourseImpl();
    }
}
