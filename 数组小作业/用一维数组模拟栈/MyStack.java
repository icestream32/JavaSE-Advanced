package 数组小作业.用一维数组模拟栈;

public class MyStack {
    // 定义一个常量，用于确定栈的容量
     static final int LENGTH = 5;

    // 定义一个一维数组，模拟栈
    private Object[] elements = new Object[LENGTH];

    // 构造函数
    public MyStack() {
        
    }

    // push方法，用于压栈操作
    public void push(Object obj) {

        if (elements[LENGTH - 1] != null) {
            System.out.println("栈已满!");
        } else {
            for (int i = elements.length - 1; i > 0; i--) {
                elements[i] = elements[i - 1]; 
            }
            elements[0] = obj;
            System.out.println("压栈操作成功!");
        }

    }

    // pop方法，用于弹栈操作
    public Object pop(){

        if (elements[0] == null) {
            System.out.println("栈为空!");
            return null;
        } else {
            int i;
            Object pop_obj = elements[0];
            for (i = 0; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[i] = null;
            System.out.println("弹栈操作成功!");
            return pop_obj;
        }

    }

}
class test{
    public static void main(String[] args) {
        
        MyStack s = new MyStack();

        String a1 = "123";
        s.push(a1);
        String a2 = "456";
        s.push(a2);
        String a3 = "789";
        s.push(a3);
        String a4 = "132";
        s.push(a4);
        String a5 = "246";
        s.push(a5);
        s.push(a5);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}