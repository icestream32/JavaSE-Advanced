package 集合.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
List接口中的常用方法
    1.List集合存储元素的特点：有序可重复
    从0开始，以1递增。
    可重复：存储一个1，还可以再存一个1
    2.List接口作为Collection接口的子接口，有以下特色方法
        void add​(int index, E element) 
        E get​(int index) 
        int indexOf​(Object o)  
        E set​(int index, E element) 
 */
public class ListTest01 {
    public static void main(String[] args) {
        
        // 定义一个List接口
        List<Object> myList = new ArrayList<>();
        // 添加元素
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        // void add​(int index, E element)
        // 往集合的下标位置添加元素
        myList.add(1,"KING");
        Iterator<Object> it = myList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // A KING B C D
        }
        System.out.println();

        // E get​(int index)
        // 获取下标处的元素值并以Object类返回
        System.out.println(myList.get(1)); // KING

        // int indexOf​(Object o)
        // 获取List集合中元素的下标并返回，如果没有，则返回-1
        System.out.println(myList.indexOf("KING")); // 1
        System.out.println(myList.indexOf(1)); // -1

        // E set​(int index, E element) 
        // 覆盖一个下标处的元素
        myList.set(1, "KINGDOM");
        System.out.println(myList.get(1)); // KINGDOM

        // List集合的特殊遍历
        // 由于List集合中get方法的存在，使得List集合可以以循环的形式遍历
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " "); // A KINGDOM B C D
        }


    }
}
