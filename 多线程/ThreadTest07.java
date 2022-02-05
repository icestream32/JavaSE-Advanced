package 多线程;
/*
实现守护线程：
    Java语言中线程种类有两种，分别是
        用户线程
            例如main方法下的线程
        守护线程
            例如JVM垃圾回收器线程
    守护线程的设置方式：
        调用线程对象中的void setDaemon​(boolean on) 可以将该线程标记为守护线程
        该方法要在启动线程前使用
    守护线程一般定义为死循环，会随着用户线程结束而结束
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        
        MyThread5 t = new MyThread5();
        // 设置守护线程
        t.setDaemon(true);
        t.start();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程为--->" + i);
        }

    }
}
class MyThread5 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("守护线程为--->" + (++i));
        }
    }
    
}
