package 异常处理;
// 自定义异常在开发中的应用
// 异常最重要的知识点
// 下面拿之前的数组模拟栈作例子
public class ExceptionTest06 {
    public static void main(String[] args) {
        
        Object obj = new Object();
        MyStack mystack = new MyStack();
        // 在测试类里进行异常捕捉
        try {
            mystack.push(obj);
            mystack.push(obj);
            mystack.push(obj);
            mystack.push(obj);
            mystack.push(obj);
            // 压栈失败
            mystack.push(obj);
        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }
        try {
            mystack.pop();
            mystack.pop();
            mystack.pop();
            mystack.pop();
            mystack.pop();
            // 弹栈失败
            mystack.pop();
        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
