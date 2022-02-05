package 多线程.线程安全.账户取款演示;
// 定义一个账户类
public class Account {
    
    // 账户名
    private String act;
    // 余额
    private double balance = 10000;

    public Account(String act) {
        this.act = act;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public double getBalance() {
        return balance;
    }

    // 取款操作
    public void getMoney(double money) {
        // 为了实现线程同步编程,我们需要添加synchronized关键字
        /*
        线程同步的语法是:
            synchronized(){
                // 线程同步代码块
            } 
            synchronized后面的小括号中传的这个"数据"是相当关键的.
            这个数据必须是多线程共享的数据,才能达到多线程排队.

            ()中写什么?
                那要看程序员想让哪些线程同步.
                假设有t1 t2 t3,有三个线程.
                只是希望前面两个排队,其他不需要排队怎么办?
                你一定要在()中写一个前面两个共享的对象,而这个对象对于t3来说不是共享的.
         */
        synchronized(this){
            // 取款前余额
            double before = balance;
            // 在这里模拟网络延迟,这样双线程并发必出问题,延迟100ms
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    
            // 取款后余额
            double after = before - money;
            // 更新余额
            balance = after;
        }
    
    }

}
