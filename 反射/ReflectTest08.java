package 反射;
// 通过反射机制获取一个类的父类或者接口
public class ReflectTest08 {
    public static void main(String[] args) throws Exception {
        
        Class<?> stringClass = Class.forName("java.lang.String");
        // 获取String类的父类
        Class<?> sClass = stringClass.getSuperclass();
        System.out.println(sClass.getName());

        // 获取String类实现的接口
        Class<?>[] interfClasses = stringClass.getInterfaces();
        for (Class<?> ifClass : interfClasses) {
            System.out.println(ifClass.getName());
        }

    }
}
