package cn.liuliang.designmode.factorymode.abstractionfactory;

/**
 * Java授课实例对象
 *
 * @author liuliang-刘亮
 * @date 2020/6/10 - 13:17
 */
public class JavaCourseImpl implements IJavaCourse {
    @Override
    public void javaCourse(String name) {
        System.out.println(name+"-------java授课方法");
    }
}
