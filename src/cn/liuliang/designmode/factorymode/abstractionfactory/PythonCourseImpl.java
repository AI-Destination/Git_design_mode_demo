package cn.liuliang.designmode.factorymode.abstractionfactory;

/**
 * @author liuliang-刘亮
 * @date 2020/6/10 - 13:18
 */
public class PythonCourseImpl implements IPythonCourse{
    @Override
    public void pythonCourse(String name) {
        System.out.println(name+"-------python授课方法");
    }
}
