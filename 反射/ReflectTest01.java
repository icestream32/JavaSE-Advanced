package 反射;
/*
获取class的三种方式：
    1.Class c = Class.forName("完整类名加包名");
    2.Class c = 对象.getClass();
    3.Class c = 任何类型.class;
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        
        // 第一种方式：
        Class<?> c1 = null;
        try {
            c1 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 第二种方式
        String s = "abc";
        Class<?> c2 = s.getClass();

        // 第三种方式
        Class<?> c3 = String.class;

        // 这三种方式得到的都是String.class字节码文件
        System.out.println(c1 == c2); // true
        System.out.println(c1 == c3); // true


    }
}
