package 数组小作业.用一维数组模拟栈;
// 讲评版本，相比于之前写的少了for循环，关键是对于栈的理解还不够深，不知道栈帧这个概念
// 还有就是一些值得注意的细节要注意
public class MyStack {
    // 定义一个常量，用于确定栈的容量
     static final int LENGTH = 5;

    // 定义一个一维数组，模拟栈
    private Object[] elements;

    // 定义一个栈帧，永远指向栈顶元素
    private int index;
    
    // 构造函数
    // 推荐在构造函数这初始化实例变量
    public MyStack() {

        this.elements = new Object[LENGTH];
        this.index = -1;
    }
    //setter and getter方法不论何时都要默认加
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    
    // push方法，用于压栈操作
    public void push(Object obj) {
        //只要栈帧值为数组长度-1，则栈已满
        if (index == elements.length - 1) {
            System.out.println("压栈失败，栈已满!");
        } else {
            //压栈操作
            elements[++index] = obj;
            System.out.print("压栈" + elements[index] + "成功！");
            System.out.println("栈帧指向" + index);
        }

    }

    // pop方法，用于弹栈操作
    public Object pop(){

        if (index < 0) {
            System.out.println("弹栈失败，栈为空!");
            return null;
        } else {
            //弹栈操作
            Object object_pop = elements[index];
            System.out.print("弹栈" + elements[index] + "成功！");
            System.out.println("栈帧指向" + --index);
            return object_pop;
        }

    }

} 