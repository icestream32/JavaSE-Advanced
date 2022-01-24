package 异常处理;
// 自定义异常类，用于栈异常操作
public class MyStackOperationException extends Exception {
    public MyStackOperationException() {

    }
    public MyStackOperationException(String s) {
        super(s);
    }
}
