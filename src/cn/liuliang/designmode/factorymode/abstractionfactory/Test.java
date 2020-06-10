package cn.liuliang.designmode.factorymode.abstractionfactory;

/**
 * @author liuliang-刘亮
 * @date 2020/6/10 - 13:23
 */
public class Test {
    public static void main(String[] args) {
        SangGuiGuCourseFactory sangGuiGuCourseFactory = new SangGuiGuCourseFactory();
        sangGuiGuCourseFactory.getJavaCourse().javaCourse("尚硅谷");
        sangGuiGuCourseFactory.getPythonCourse().pythonCourse("尚硅谷");

        HeiMaCourseFactory heiMaCourseFactory = new HeiMaCourseFactory();
        heiMaCourseFactory.getJavaCourse().javaCourse("黑马");
        heiMaCourseFactory.getPythonCourse().pythonCourse("黑马");
    }
}
