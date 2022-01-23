package 常用类.Packaging;

// byte常量池的介绍
// 分析以下程序的区别
public class IntegerTest02 {

    public static void main(String[] args) {

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b); // false

        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y); // true

        /*
         * 解释：
         * - "=="始终是比较两个引用类型变量的内存地址（toString方法没有重写时）
         * - 在调用Integer包装类时，JVM会在方法区内开辟一块内存空间，此时byte长度（-128-127）的数值会放入该内存空间
         * - 一旦在栈中创建Interge变量时，只要设置的整型数字在byte长度内，那么他们的内存地址统一指向那块方法区内存空间
         * - 这种机制在计算机组成原理中叫做缓存（cache）
         *  - 优点：缓存效率高，程序执行速度快
         *  - 缺点：缓存需要占用一定的内存空间
         */

    }

}
