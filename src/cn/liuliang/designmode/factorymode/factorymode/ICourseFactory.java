package cn.liuliang.designmode.factorymode.factorymode;

/**
 * 创建课程对象的工厂接口
 * 工厂方法模式大体构思：
 * 1，一个功能接口：指定规范，就是接口中的方法
 * 2，一个创建功能接口对象实例的工厂接口：负责创建具体对象
 * 3，一个具体的功能实现类就对应要有一个对应的创建对象的工厂。
 *
 * @author liuliang-刘亮
 * @date 2020/6/10 - 12:12
 */
public interface ICourseFactory {

    /**
     * 创建授课对象
     *
     * @return 授课对象
     */
    ICourse getCourse();
}
