package 多线程.线程安全.账户取款演示;
// 用户线程类
public class ThreadUser implements Runnable {

    // 账户对象
    private Account act;

    // 取款金额
    private double money;

    // 构造方法传入账户对象和取款金额
    public ThreadUser(Account act, double money) {
        this.act = act;
        this.money = money;
    }

    // 账户进行取款操作
    @Override
    public void run() {
        act.getMoney(money);
        System.out.println("账户" + act.getAct() + "取款成功,余额剩余:" + act.getBalance());
    }

    
}
