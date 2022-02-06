package 多线程;

import java.util.ArrayList;
import java.util.List;

/*
1.使用wait方法和notify方法实现“生产者和消费者模式”
2.什么时“生产者和消费者模式？”
    生产线程负责生产，消费线程负责消费。
    生产线程和消费线程要达到均衡。
    这是一种特殊的业务，在这种特殊的情况下需要使用wait方法和notify方法
3.wait和notify方法不是线程对象的方法，是普通Java对象都有的方法。
4.wait方法和notify方法建立在线程同步的基础上。因为多线程要同时操作一个仓库，有线程安全问题。
5.wait方法作用：o.wait()让正在o对象上活动的线程t进入等待状态，并且释放掉t线程之前占有的o对象的锁。
6.notify方法作用：o.notify()让正在o对象上等待的线程唤醒，只是通知，不会释放o对象上之前占有的锁。
7.模拟这样一个需求：
    仓库我们采用List集合。
    List集合中假设只能存储一个元素。
    1个元素表示仓库满了。
    如果List集合中元素个数是0，就表示仓库空了。
    保证List集合中永远都是最多存储一个元素。
 */
public class ThreadTest09 {
    public static void main(String[] args) {
        
        // 新建一个仓库对象
        List<Object> list = new ArrayList<>();

        // 创建两个线程
        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));

        // 给线程设置名字
        t1.setName("生产线程");
        t2.setName("消费线程");

        // 启动线程
        t1.start();
        t2.start();

    }
}

// 生产线程
class Producer implements Runnable {

    // 两个线程共享一个仓库
    List<Object> list;
    
    public Producer(List<Object> list) {
        this.list = list;
    }

    @Override
    public void run() {
        // 用死循环模拟生产线程一直生产
        while (true) {
            // 利用synchronized关键字将消费列入同步代码块
            synchronized(list) {
            // 如果仓库容量大于0，那么生产线程进入睡眠状态
            if (list.size() > 0) {
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 程序执行到这里说明仓库里面为空,生产所需对象
            Object o = new Object();
            list.add(o);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--->" + o);
            // 唤醒消费线程
            list.notify();
            }
        }
    }

}

// 消费线程
class Consumer implements Runnable {

    // 两个线程共享一个仓库
    List<Object> list;

    // 构造方法传入list仓库对象
    public Consumer(List<Object> list) {
        this.list = list;
    }

    @Override
    public void run() {
        // 用死循环模拟消费者一直消费
        while (true) {
            // 利用synchronized关键字将消费列入同步代码块
            synchronized(list) {
            // 如果仓库容量等于0，那么消费线程进入睡眠状态
            if (list.size() == 0) {
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 程序执行到这里说明仓库里面不为空，消费所供对象
            Object o = list.remove(0);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + o);
            // 唤醒生产线程
            list.notify();
            }
        }       
        
    }

}
