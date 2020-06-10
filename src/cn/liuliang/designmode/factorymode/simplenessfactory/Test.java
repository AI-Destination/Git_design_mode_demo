package cn.liuliang.designmode.factorymode.simplenessfactory;

/**
 * 简单工厂测试
 *
 * @author liuliang-刘亮
 * @date 2020/6/10 - 9:20
 */
public class Test {
    public static void main(String[] args) {
        //通过名称创建，有点麻烦
        ICourse course = CourseFactory.getCourse("Java");
        if (course != null) {
            course.giveLessons();
        }else {
            System.out.println("没有相关授课");
        }

        //通过反射创建
        try {
            ICourse course1 = CourseFactory.getCourse(PythonCounseImpl.class);
            course1.giveLessons();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
