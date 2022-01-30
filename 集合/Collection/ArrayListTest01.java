package 集合.Collection;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList集合：
    1.默认初始化容量10
    2.集合底层是一个Object[]类数组。
    3.构造方法：
        new ArrayList();
        new ArrayList(数组长度);
    4.ArrayList集合的扩容：
        增长到原容量的1.5被。
        ArrayList集合底层就是数组，怎么优化？
            尽可能少的扩容。因为数组扩容效率比较低
            建议在使用ArrayList集合的时候预估元素的个数，给定一个初始化容量
    5.数组优点：
        检索效率比较高。
    6.数组缺点：
        随机增删元素效率比较低。
    7.向数组末尾添加元素，效率很高，不受影响
    8.面试官经常问的一个问题？
        这么多的集合中，你用哪个集合最多？
        答：ArrayList集合。
        因为往数组末尾添加元素，效率不受影响
        另外，我们检索/查找某个元素的操作比较多。  
    9.ArrayList是非线程安全的集合。      
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        
        // 创建一个ArrayList对象,长度默认为10
        List<Object> list = new ArrayList<>();
        // 注意，size方法是当前集合中所含有元素的个数，而不是ArrayList的长度
        // 往数组末尾添加元素效率比较高
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        // 数组扩容
        list.add(11);
        /* 扩容源码
        数组容量会增大1.5倍
        int newCapacity = ArraysSupport.newLength(oldCapacity,
                    minCapacity - oldCapacity,oldCapacity >> 1); */

    }
}
