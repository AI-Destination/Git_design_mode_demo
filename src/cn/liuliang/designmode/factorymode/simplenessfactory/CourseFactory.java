package cn.liuliang.designmode.factorymode.simplenessfactory;

/**
 * 课程工厂
 *
 * @author liuliang-刘亮
 * @date 2020/6/10 - 9:16
 */
public class CourseFactory {
    /**
     * 根据传入的名称创建相应的对象
     *
     * @param name 相关课程名称
     * @return 具体课程对象
     */
    public static ICourse getCourse(String name) {
        if ("Java".equals(name)) {
            return new JavaCourseImpl();
        } else if ("python".equals(name)) {
            return new PythonCounseImpl();
        } else {
            return null;
        }
    }

    /**
     * 通过反射获取对象
     *
     * @param aClass 要创建对象的class
     * @return 创建的对象
     * @throws Exception 创建对象异常
     */
    public static ICourse getCourse(Class<?> aClass) throws Exception {
        return (ICourse) aClass.newInstance();
    }
}
