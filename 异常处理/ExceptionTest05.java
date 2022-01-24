package 异常处理;

// 自定义异常的使用
public class ExceptionTest05 {
    public static void main(String[] args) {

        MyException myException = new MyException("用户名错误！");
        // 调用getMessage方法获取异常简单的信息
        System.out.println(myException.getMessage());
        // 调用printStackTrace方法打印异常追踪的堆栈信息
        myException.printStackTrace();

    }
}
