package 反射;

import java.lang.reflect.Constructor;

import java.lang.reflect.Method;

// 反射机制调用Method方法
public class ReflectTest06 {
    public static void main(String[] args) throws Exception {
        
        Class<?> methodClass = Class.forName("反射.bean.UserService");
        // 新建obj对象，其实是UserService对象
        Constructor<?> constructor = methodClass.getConstructor();
        Object obj = constructor.newInstance();
        // 将login方法传到method对象中
        Method method = methodClass.getDeclaredMethod("login", String.class,String.class);
        // 调用方法
        // 利用反射机制调用方法时，方法的返回值都是Object类型
        Object retValue = method.invoke(obj, "admin","123");

        System.out.println((boolean) retValue ? "登录成功!" : "登录失败！");

    }
}
