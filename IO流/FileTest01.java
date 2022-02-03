package IO流;

import java.io.File;

/*
File
    1.File类和四大家族没有关系，所以File类不能完成文件的读和写。
    2.File对象代表什么？
        文件和目录路径的抽象表现形式。
        D:\JavaDevelopment\JDK帮助文档 这是一个File对象
        D:\JavaDevelopment\JDK帮助文档\HelloWorld.java 也是FIle对象。
        File只是一个路径名的抽象表现形式。
    3.需要掌握File类中常用的方法
 */
public class FileTest01 {
    public static void main(String[] args) {
        
        // 创建一个File对象
        File f1 = new File("D:\\JavaDevelopment\\file");

        // boolean exists() 
        // 判断是否存在
        System.out.println(f1.exists()); // false

        // boolean createNewFile() 
        // 如果D:\\JavaDevelopment\\file不存在，则以文件的形式创建出来
        /* if (!f1.exists()) {
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } */

        // boolean mkdir() 
        // 如果file不存在，则以目录的形式创建出来
        /* if (!f1.exists()) {
            f1.mkdir();
        } */

        // boolean mkdirs() 
        // 可以以多重目录的形式创建出来
        /* File f2 = new File("D:\\JavaDevelopment\\file\\a\\b\\c\\d");
        if (!f2.exists()) {
            f2.mkdirs();
        } */

        File f3 = new File("D:\\JavaDevelopment\\HelloWorld.java");
        // String getParent() 
        // 获取文件的父路径，如果文件未指明父路径，则返回null
        // 第一种方式
        String paraentPath = f3.getParent();
        System.out.println(paraentPath); // D:\JavaDevelopment
        // 第二种方式
        File parentFile = f3.getParentFile();
        System.out.println("获取绝对路径" + parentFile.getAbsolutePath()); // 获取绝对路径D:\JavaDevelopment

        File f4 = new File("HelloWorld.java");
        System.out.println("绝对路径：" + f4.getAbsolutePath()); // 绝对路径：D:\JavaDevelopment\JavaSE Advanced\HelloWorld.java

    }
}
