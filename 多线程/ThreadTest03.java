package 多线程;
/*
    1.static Thread currentThread() 
        获取当前线程对象
    2.String getName() 
        返回线程名称
        线程默认名字：
            Thread-0
            Thread-1
            Thread-2
            ......
    3.void setName​(String name) 
        设置线程名字
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        
        MyThread2 t = new MyThread2();

        // 返回线程名称
        System.out.println(t.getName()); // Thread-0

        // 设置线程名称
        t.setName("t1");
        System.out.println(t.getName());

        // 启动线程
        t.start();

    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // 获取当前线程对象的名称
            System.out.println(Thread.currentThread().getName() + "-->" + i);  // Thread[t1,5,main]-->i
        }
    }
    
}
