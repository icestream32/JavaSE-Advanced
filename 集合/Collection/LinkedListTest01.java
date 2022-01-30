package 集合.Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest01 {
    public static void main(String[] args) {
        /*
        LinkedList集合底层是一个双向链表
        链表的基本单位为结点
        链表由两部分组成：
            存储其他结点的地址的指针域（C语言叫法）
            存储数据的地方
        LinkedList把随机增删发挥到极致
        ArrayList把检索发挥到极致
        往后遇到的需要大量增删的业务时，推荐使用双向链表
        至于LinkedList集合中的方法，基本上和ArrayList差不多
        其他区别可以查阅帮助文档
         */
        List<Object> list = new LinkedList<>();
        list.add("e");

    }
}
