package 反射;
/*
可变长度参数：
    int... args 这就是可变长度参数
    语法是：类型... （注意：一定是3个点。）

    1.可变长度参数要求的参数个数是0~N个。
    2.可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有1个。
    3.可变长度参数可以当作一个数组来看待。
 */
public class ArgsTest { 
    public static void main(String[] args) {
        
        m();
        m(100);
        m(100,100);
        m(100,100,100,100);

    }
    public static void m(int... args) {
        System.out.println("m方法运行");
    }
}
