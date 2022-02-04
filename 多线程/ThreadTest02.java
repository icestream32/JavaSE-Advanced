package 多线程;
// 实现多线程的第二种方式：编写一个类，实现java.lang.Runnable接口
// 日后的开发中推荐使用这一种方法，因为是面向接口编程，接口可以实现很多个，继承不能继承很多个。
public class ThreadTest02 {
    public static void main(String[] args) {
        
        // 创建一个可运行的对象
        // MyRunnable r = new MyRunnable();
        // 将可运行的对象封装成一个线程对象
        Thread t = new Thread(new MyRunnable()); // 合并代码
        // 启动线程
        t.start();
        // 以下代码还是主线程
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程--->" + i);
        }
    }
}

// 这并不是一个线程类，是一个可运行的类，它还不是一个线程。
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("分支线程--->" + i);
        }
    }

}
