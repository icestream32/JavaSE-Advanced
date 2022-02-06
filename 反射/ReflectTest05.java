package 反射;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// 反射Method方法
public class ReflectTest05 {
    public static void main(String[] args) throws Exception {
        
        Class<?> userServiceClass = Class.forName("反射.bean.UserService");
        // 获取类中的所有方法
        Method[] methods = userServiceClass.getDeclaredMethods();
        // 输出该数组中的方法个数
        System.out.println(methods.length); // 2
        
        // 遍历
        for (Method method : methods) {
            // 输出修饰符列表
            int methodModify = method.getModifiers();
            System.out.print(Modifier.toString(methodModify) + " ");
            // 输出方法返回值类型
            Class<?> methodReturnType = method.getReturnType();
            System.out.print(methodReturnType.getSimpleName() + " ");
            // 输出方法名
            System.out.print(method.getName() + " ");
            // 输出参数类型
            Class<?>[] mPTypes = method.getParameterTypes();
            for (Class<?> mpType : mPTypes) {
                System.out.print(mpType.getSimpleName() + " ");
            }
            System.out.println();
        }
        /*
        输出结果：
            public boolean login String String 
            public void logout
         */

    }
}
