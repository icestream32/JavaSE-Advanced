package 数组.数组小作业.用一维数组模拟栈;

public class Test {
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
