package 异常处理;
// 自定义异常类，用于栈异常操作
public class MyStackOperationException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 8170593629466659297L;
    public MyStackOperationException() {

    }
    public MyStackOperationException(String s) {
        super(s);
    }
}
