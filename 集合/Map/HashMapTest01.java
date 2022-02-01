package 集合.Map;

import java.util.*;

/*
HashMap集合：
    1.HashMap集合底层是哈希表/散列表的数据结构。
    2.哈希表是一个怎样的数据结构呢？
        哈希表是一个数组和单向链表的结合体。
        数组：在查询方面效率很高，随机增删方面效率很低。
        单向链表：在随机增删方面效率较高，在查询方面效率较低。
        哈希表将以上的两种数据结构融合在一起，充分发挥它们各自的优点。
    3.HashMap集合底层的源代码：
        public class HashMap {
            // HashMap底层实际上就是一个数组。（一维数组）
            transient Node<K,V>[] table;
            // 静态内部类HashMap.Node
            static class Node<K,V> implements Map.Entry<K,V> {
                // hash值通过哈希函数/算法，可以生成一个唯一值.
                final int hash; // 哈希值(哈希值是key的hashCode()方法的执行结果)
                final K key; // 存储到Map集合中的那个key。
                V value; // 存储到Map集合中的那个value。
                Node<K,V> next; // 下一个结点的内存地址。
            }
        }
        哈希表/散列表：一维数组，这个数组中每一个元素是一个单向链表。（数组和链表的结合体。）
        详情请见文件：哈希表数据结构.png
        从哈希表数据结构知，在进行增删和检索操作时，要频繁用到hashCode方法和equals方法，因此在存储一般对象时，需要重写hashCode和equals算法。
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        System.out.println(hashMap); // 默认输出{}
    }
}
