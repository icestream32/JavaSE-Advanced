package 反射;

/* import java.lang.reflect.Field; */

// 该例用于Field属性中的访问操作
// 注意：反射机制让代码复杂了，但是为了一个“灵活”，这也是值得的
public class ReflectTest04 {
    public static void main(String[] args) throws Exception {
        
        /* // 使用反射机制，访问一个对象的属性。（set get）
        Class<?> studentClass = Class.forName("反射.bean.Student");
        Object obj = studentClass.newInstance();

        // 获取number属性（根据属性的名称来获取Field）
        Field numField = studentClass.getDeclaredField("number");

        // 给obj对象（Student对象）的no属性赋值
        numField.set(obj, 2222);
        
        // 读属性的值
        System.out.println(numField.get(obj));

        // 可以访问私有的属性吗？
        // 不能正常访问：java.lang.IllegalAccessException
        Field nameField = studentClass.getDeclaredField("name");
        // 访问私有对象属性需要打破封装
        // 这是反射机制的缺点，可能会给不法分子留下机会！！！
        nameField.setAccessible(true);

        // 给name属性赋值
        nameField.set(obj, "zhangsan");

        // 读name属性的值
        System.out.println(nameField.get(obj)); */


    }
}
