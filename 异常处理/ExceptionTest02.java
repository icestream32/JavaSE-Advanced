package 异常处理;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 异常的常用方法
public class ExceptionTest02 {
    /* 
        - 每一个异常类都有以下两种方法
        - String msg = exception.getMessage();
            获取异常简单的描述信息
        - exception.printStackTrace();
            打印异常追踪的堆栈信息 
        - 今后的项目开发中，都需要用到上面的异常方法，有助于了解程序是否出了问题
    */
    public static void main(String[] args) {
        
        try {
            m3();
        } catch (Exception e) {
            // 输出异常简单的描述信息
            // D:\JavaDevelopment\JavaS Advanced\异常处理\test.txt (系统找不到指定的路径。)
            System.out.println(e.getMessage());
            // 打印异常追踪的堆栈信息
            /*
                at java.base/java.io.FileInputStream.open0(Native Method)
                at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
                at 异常处理.ExceptionTest02.m1(ExceptionTest02.java:55)
                at 异常处理.ExceptionTest02.m2(ExceptionTest02.java:51)
                at 异常处理.ExceptionTest02.m3(ExceptionTest02.java:47)
                at 异常处理.ExceptionTest02.main(ExceptionTest02.java:20)
             */
            e.printStackTrace();
            // 查看堆栈信息从上往下看，SUM公司写的代码就不需要看了
            // 看包名就知道是SUM公司的还是自己的
            // 大部分情况下出错的是自己的代码
            // 自己写的代码的第一句就是源头，在第55行
        }
        System.out.println("HelloWorld!");

    }

    private static void m3() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m1();
    }

    private static void m1() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("D:\\JavaDevelopment\\JavaS Advanced\\异常处理\\test.txt");
        try {
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
