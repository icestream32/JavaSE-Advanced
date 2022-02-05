package 多线程;
/*
void interrupt() 
唤醒正在睡眠的进程
此方法利用了异常机制，会以InterruptedException异常抛出
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        
        // 主线程睡眠一年
        Thread t =new MyThread4();

        t.start();
        
        // 以下代码正常情况下一年之后才能执行
        // 那么调用interrupt方法强行唤醒
        
        // java.lang.InterruptedException: sleep interrupted
        // 强行唤醒后异常会被捕捉并打印睡眠唤醒异常信息
        t.interrupt();


    }
}

class MyThread4 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(1000 * 60 * 60 * 24 *365);
            System.out.println("hello world!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
