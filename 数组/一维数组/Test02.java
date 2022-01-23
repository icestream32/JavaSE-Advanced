package 数组.一维数组;
//用于测试main方法中的string[] 数组的作用
public class Test02 {
    /* 
        - string数组默认输出0
        - 在VS Code中，main方法的string输出配置在运行中的打开配置中，
            在配置目录下添加string数组名外加添加的数据
            例如："args": "zhangsan 123",
            注意：要在mainClass前面配置，不然会报错
     */
    //测试案例:用main方法中的string模拟一个用户登录系统
    public static void main(String[] args) {
        //读取数组长度
        if (args.length != 2){
            System.out.println("请输入正确的用户名和密码！例如：zhangsan 123");
            return;
        }
        //获取当前用户名和密码
        String userName = args[0];
        String userPassword = args[1];

        //验证正确的密码
        //用于是字符串，因此调用equals方法验证字符串是否相同
        //另外，可以将正确的用户名调用equals方法，可以有效防止空指针异常
        if ("admin".equals(userName) && "123".equals(userPassword)) {
            System.out.println("用户认证成功，欢迎使用该系统！");
        }
        else {
            System.out.println("对不起，用户名不存在或者密码错误，请重试！");
        }
    }
}
