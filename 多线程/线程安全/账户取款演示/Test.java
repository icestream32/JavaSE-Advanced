package 多线程.线程安全.账户取款演示;
// 测试类
public class Test {
    public static void main(String[] args) {
        
        // 创建一个账户对象
        Account act = new Account("act-001");

        // 创建两个线程对象,分别模拟我和小鹏同时取款
        Thread wo = new Thread(new ThreadUser(act, 5000)); // 我取款5000
        wo.setName("wo");
        Thread xiaoPeng = new Thread(new ThreadUser(act, 5000)); // 小鹏取款5000
        xiaoPeng.setName("xiaoPeng");

        // 启动线程
        wo.start();
        xiaoPeng.start();

    }
}
