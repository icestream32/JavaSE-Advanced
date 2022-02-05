package 多线程;
/*
中断线程的方法：
    1.void stop() 
        这种方法已经过时，不推荐使用
        因为强行中断后，保留在内存中的数据可能就会丢失
    2.在类中设置布尔类型标识符
        详情请看下方代码
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        
        MyRunnable2 r = new MyRunnable2();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();
        // 5秒后终止t线程
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 线程终止
        r.run = false;

    }
}

class MyRunnable2 implements Runnable {

    // 通常在线程对象中，我们会添加布尔类型值来终止线程
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("--->" + i);
            } else {
                // 线程终止后就返回
                // 在return前面我们可以添加操作用来保存数据
                return;
            }
        } 
    }

}
