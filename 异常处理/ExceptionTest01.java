package 异常处理;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest01 {
    /*
        - 异常是Java语言中应对错误的一种方式，旨在提醒程序员错误在哪
        - 异常能够使得程序变得更加健壮
        - 异常种类
            - Error：此类异常编译器直接停止运行，没有妥协的余地
            - Exception：此类异常分为编译异常和运行异常
                - RuntimeException：运行异常，一般不需要处理
                    例如：System.out.println(100 / 0); java.lang.ArithmeticException 算术异常
                - Exception类的其他子类：这些异常需要处理
                    例如：PrinterException、ClassNotLoadedException
        - 异常处理有两种方式：
            - 向上抛出(throws关键字) 说白了推卸责任，把异常抛给调用自己方法的人处理
            - 捕捉异常(try...catch字段) 自行处理，try中语句为正常执行的代码，catch中语句为处理异常时的代码 
        - 往后开发中，如果需要调用者处理，则使用throws上报，其他情况自己处理
     */
    public static void main(String[] args) {
        
        System.out.println("main begin");
        // 如果在main方法中选择抛出异常，那么是Java虚拟机JVM接受到异常
        // 一旦JVM收到异常，那么程序就会停止，所以
        // 在main方法中，一般采取第二种方法，也就是try...catch的形式捕捉异常
        try {
            // try尝试，程序如果没有异常则执行下面的代码
            // 此时程序执行的过程
            /* 
                main begin
                m3 begin
                m2 begin
                m1 begin
                m1 over
                m2 over
                m3 over
                main over
             */
            m3();
            // 但如果try中发生了异常，那么下面的代码也执行不了
            System.out.println("main over");
        } catch (FileNotFoundException e) {
            // 如果发生异常，那么catch就捕捉到了异常，以引用类型FileNotFoundException赋值变量e
            // 此时程序执行的过程
            /*
                m3 begin
                m2 begin
                m1 begin
                文件不存在！
             */
            // 默认输出：java.io.FileNotFoundException: D:\JavaDevelopment\JavaS Advanced\异常处理\test.txt (系统找不到指定的路径。)
            // System.out.println(e); 
            System.out.println("文件不存在！");
        }
        
        

    }

    public static void m3() throws FileNotFoundException{
        System.out.println("m3 begin");
        // 这里的子方法可以选择继续向上抛出
        m2();
        // 如果上方发生异常，那么下面的代码就不会执行
        // 如果选择向上抛出异常，那么下面的代码也不会被执行
        System.out.println("m3 over");
    }

    public static void m2() throws FileNotFoundException{
        System.out.println("m2 begin");
        // 这里的子方法可以选择继续向上抛出
        m1();
        // 如果上方发生异常，那么下面的代码就不会执行
        // 如果选择向上抛出异常，那么下面的代码也不会被执行
        System.out.println("m2 over");
    }

    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        // 使用流输入文件时，可能会找不到当前所在文件，这就是FileNotFoundException异常，需要对这种异常进行处理
        // 在子方法中我们可以在方法上添加throws关键字抛出这个异常：throws FileNotFoundException
        FileInputStream file = new FileInputStream("D:\\JavaDevelopment\\JavaS Advanced\\异常处理\\test.txt");
        try {
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 如果选择向上抛出异常，那么下面的代码也不会被执行
        System.out.println("m1 over");
    }

}