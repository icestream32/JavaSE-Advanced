package 反射;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
反射机制的作用:
    java代码写一遍,再不改变Java源代码的基础之上,可以做到不同对象的实例化.
    非常之灵活.(符合OCP开闭原则:对扩展开放,对修改关闭.)

在Java学习后期要学到高级框架,这些高级框架的代码底层都是反射机制,
对于之后理解框架有很大的帮助.
 */
public class ReflectTest02 {
    public static void main(String[] args) {
        
        // 可以通过属性配置文件数据Java包的地址
        FileInputStream file = null;
        // 创建一个Properties集合
        Properties pro = new Properties();
        try {
            file = new FileInputStream("反射/bean/classinfo.properties");
            // 将配置文件装载进入ProPerties集合
            pro.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 获取value，即Java包的地址
        /* String className = pro.getProperty("className");
        try {
            Class<?> c = Class.forName(className);
            try {
                Object obj = c.newInstance();
                // 因为在.properties配置文件中包名为java.util.Date
                // 在调用newInstance()方法会自动生成日期对象
                System.out.println(obj); // Sun Feb 06 11:14:43 HKT 2022
                // 如果将其改成反射.bean.User
                // 那么就会生成自定义类User对象
                // 好像有中文就不行，那就算了。。。
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } */

    }
}
