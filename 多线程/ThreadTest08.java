package 多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
实现线程的第三种方式：
    java.util.concurrent.Callable接口
这种方式的优点：可以获得位于其他线程的返回值返回到当前线程
这种方式的缺点：效率比较低，在进行其他线程时，当前线程处于阻塞状态
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        
        // 创建线程对象
        FutureTask<Integer> ct = new FutureTask<>(new CallThread());
        Thread t = new Thread(ct);
        // 启动线程
        t.start();
        // 获取线程返回值
        // 此时主线程发生阻塞，等Callable线程执行结束后才能进行
        try {
            System.out.println(ct.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("hello world!");

    }
}

// 设置一个线程类
class CallThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Callable线程正在执行！");
        Thread.sleep(1000 * 10);
        System.out.println("Callable线程执行结束！");
        return 100 + 200; // 自动装箱
    }

}