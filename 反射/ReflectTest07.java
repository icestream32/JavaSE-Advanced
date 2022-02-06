package 反射;

import java.lang.reflect.Constructor;

// 反射机制调用构造方法
public class ReflectTest07 {
    public static void main(String[] args) throws Exception {
        
        Class<?> constructorClass = Class.forName("反射.bean.Vip");
        // public Vip(String name, int number, boolean sex, String birth)
        Constructor<?> constructor = constructorClass.getConstructor(String.class,int.class,boolean.class,String.class);
        // 在JDK9之后，Class类中的T newInstance() 方法已经过时
        // SUM公司强调必须调用Constructor类来反射构造方法
        // 无参构造：constructor.newInstance();
        Object obj = constructor.newInstance("zhangsan",123,true,"2001-10-01");
        // Vip [birth=2001-10-01, name=zhangsan, number=123, sex=true]
        System.out.println(obj);

    }
}
