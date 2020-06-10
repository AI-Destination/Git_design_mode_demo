package cn.liuliang.designmode.factorymode.factorymode;

/**
 * 工厂模式测试类
 *
 * @author liuliang-刘亮
 * @date 2020/6/10 - 12:18
 */
public class Test {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.getCourse().giveLessons();
    }
}
