package 反射;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

// 反射Student类当中所有的Field
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        
        // 获取整个类
        // 在查找类时不要输入文件后缀名
        Class<?> studentClass = Class.forName("反射.bean.Student");

        // 获取类中所有的公开Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length); // 1
        // Field fName = fields[0];
        // System.out.println(fName.getName()); // number

        System.out.println("===========================");

        // 获取类中的所有Field
        Field[] fields2 = studentClass.getDeclaredFields();
        System.out.println(fields2.length); // 4
        // 遍历
        for (Field field : fields2) {
            // 输出所有Field的修饰符列表
            int i = field.getModifiers(); // 返回的修饰符是一个数字，每个数字是修饰符的代号！
            // System.out.println(i);
            // 需要调用java.lang.reflect.Modifier类中的toString静态方法！
            String fieldModifiers = Modifier.toString(i);
            System.out.print(fieldModifiers + " ");
            // 输出所有Field的数据类型
            Class<?> fieldType = field.getType();
            // 获取所有Field的简单的数据类型（指不带包名）
            String fieldSimepleType = fieldType.getSimpleName();
            System.out.print(fieldSimepleType + " ");
            // 获取所有Field属性的名字
            String fieldName = field.getName();
            System.out.println(fieldName);

        }


    }
}
