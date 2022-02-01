package 集合.Map;

import java.util.Set;
import java.util.TreeSet;

/*
    1.TreeSet集合底层实际上是一个TreeMap。
    2.TreeMap集合底层实际上是一个二叉树。
    3.放到TreeSet集合中的元素，实际上等同于TreeMap中的key部分。
    4.TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序排序
    称为：可排序集合
 */
public class TreeMapTest01 {
    public static void main(String[] args) {
        
        // 创建一个TreeSet集合
        Set<String> myTree = new TreeSet<>();
        myTree.add("zhangsan");
        myTree.add("zhangsi");
        myTree.add("zhaoliu");
        myTree.add("wangwu");
        for (String sets : myTree) {
            System.out.print(sets + " "); // wangwu zhangsan zhangsi zhaoliu 
        }
        System.out.println();

    }
}
