package 多线程.线程安全;
// synchronized关键字可能会造成死锁问题
// 以下为代码演示死锁
public class DeadLock {
    public static void main(String[] args) {
        
        Object o1 = new Object();
        Object o2 = new Object();
        // 两个线程共享一个对象
        ThreadTest1 t1 = new ThreadTest1(o1, o2);
        ThreadTest2 t2 = new ThreadTest2(o1, o2);

        t1.start();
        t2.start();
        /*
        程序运行之后会一直卡住不懂，不会发生异常，也不会停止
        最终结论：
            在往后的开发中尽量不要使用synchronized嵌套 
         */
    }
}

class ThreadTest1 extends Thread {
    Object o1;
    Object o2;

    public ThreadTest1(Object o1,Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized(o1){
            // 模拟网络延迟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(o2){

            }
        }
    }
}

class ThreadTest2 extends Thread {
    Object o1;
    Object o2;

    public ThreadTest2(Object o1,Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized(o2){
            // 模拟网络延迟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(o1){

            }
        }
    }
    }

