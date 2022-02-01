package 集合.Map;

import java.util.HashSet;
import java.util.Set;

/*
重写hashCode和equals方法：
    注意：如果一个类的equals方法重写了，那么hashCode方法必须重写。
        并且Equals方法返回如果是true，hashCode方法返回的值必须一样。
        equals方法返回true表示两个对象相同，在哈希表上中的同一个单链表比较。
        那么对于同一个单向链表上的节点来说，他们的哈希值是相同的。
        所以hashCode方法的返回值也应该相同。
    hashCode方法和equals方法不用研究需要，可以使用工具一键生成
        VS Code右键源代码操作
        IDEA工具一键生成

 */
public class HashMapTest02 {
    // 代码演示为什么要同时重写hashCode和equals方法
    public static void main(String[] args) {
        
        // 没有重写hashCode方法的情况
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");
        // 输出hashCode值和equals比较结果
        // 可以看到，虽然两个对象一致hashCode值不一致
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.hashCode()); // 681842940
        System.out.println(s2.hashCode()); // 1392838282
        // 创建Set集合
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        // 此时输出的Set集合中的元素个数应该为1。Set集合特点：无序不可重复
        System.out.println(students.size()); // 2
        /*
        出现上述情况的原因：
            我们知道，哈希表在添加元素是可能会调用equals方法，也可能不会调用equals方法
            但一定会调用hashCode方法
            在如果hashCode方法没有能够被重写
            那么这两个相同元素都会分别根据不同的哈希值放入哈希数组的不同链表中
            就不能满足Set集合无序不重复的特性了
            哈希数组大大增长，就没有链表的特性了。
        结论：我们需要同时重写hashCode和equals方法
         */

        //  同时重写hashCode和equals方法的情况
        Product p1 = new Product("shipin");
        Product p2 = new Product("shipin");
        // 输出hashCode值和equals比较结果
        // 可以看到，它们的哈希值都一致
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.hashCode()); // -903329664
        System.out.println(p2.hashCode()); // -903329664
        Set<Product> products = new HashSet<>();
        products.add(p1);
        products.add(p2);
        System.out.println(products.size()); // 1

    }
}
