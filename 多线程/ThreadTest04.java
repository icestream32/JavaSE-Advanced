package 多线程;
/* 
关于线程中的sleep方法：
    static void sleep​(long millis) 
    该方法为静态方法，不受对象的影响
    使所在线程睡眠，时间单位为毫秒
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        
        // 创建线程对象
        MyThread3 t = new MyThread3();
        // 启动线程
        t.start();
        // 使主线程睡眠5000毫秒再输出
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HelloWorld!");
        /*
        分支线程和主线程同时进行
        在第五秒时同时输出HelloWorld!和--->4
        */
        
    }
}

class MyThread3 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // 使分支线程睡眠1000毫秒，每秒输出一次
            // 会有InterruptedException，也就是唤醒异常，需要捕捉
            // 在这里不能使用上抛异常，因为父类上抛了异常
            try {
                Thread.sleep(1000);
                System.out.println("--->" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
