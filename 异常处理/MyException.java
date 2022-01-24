package 异常处理;
// 自定义异常需要继承异常的老祖宗Exception
public class MyException extends Exception {
    // 然后模仿SUM公司的两个构造方法
    public MyException(){

    }
    public MyException(String s){
        super(s);
    }
}
