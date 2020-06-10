package cn.liuliang.designmode.factorymode.abstractionfactory;

/**
 * 抽象工厂接口
 *
 * @author liuliang-刘亮
 * @date 2020/6/10 - 13:12
 */
public interface AbstractionFactory {

    /**
     * 创建Java授课对象
     *
     * @return Java授课接口实例
     */
    IJavaCourse getJavaCourse();

    /**
     * 创建python授课实例
     *
     * @return python接口实例
     */
    IPythonCourse getPythonCourse();

}
