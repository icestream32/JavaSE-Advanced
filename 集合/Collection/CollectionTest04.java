package 集合.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// remove方法的使用
public class CollectionTest04 {
    public static void main(String[] args) {
        
        // 创建集合对象
        Collection c = new ArrayList();
        // 往集合对象中添加元素
        c.add("s");
        String a = "s";
        // Collection中的remove方法
        // 以下代码执行后，会输出什么？
        c.remove(a);
        System.out.println(c.size()); // 0
        /*
        为什么remove字符串a但集合c中的字符串也被删除了呢？
        原因：
            Collection集合中的remove方法底层也是equals方法 
            由于String类中equals方法已经重写
            那么remove方法执行内容是对于字符串常量池的删除
            也就是说字符串s中保存的内存地址和集合中指向"s"的字符串内存地址是相同的
            因此它们在删除后都为空
        结论：在集合中保存的对象所对应的类，必须重写equals方法
         */

        //  Iterator中的remove方法
        Collection c2 = new ArrayList();
        // Iterator it = c.iterator(); 不能在创建集合对象的时候就创建迭代器对象，此时集合中的元素为空
        c2.add(1);
        c2.add(2);
        c2.add(3);
        c2.add(4);
        // 创建迭代器对象
        Iterator it2 = c2.iterator();
        // 遍历
        while (it2.hasNext()) {
            // c2.remove(it2.next()); 不能在集合中删除，会出现异常：java.util.ConcurrentModificationException
            // 可使用迭代器中的方法删除
            Object obj = it2.next();
            it2.remove();
            /*
            remove的使用条件
            remove中前面必须要有迭代器中的next方法，因为一开始迭代器不指向集合中的元素
            为什么不能在迭代器遍历中使用Collection中的remove方法？
            原因：
                生成迭代器时，相当于拷贝一份集合中的元素到迭代器中遍历（快照）
                如果集合中的元素被集合中的remove方法删除，那么迭代器中的元素和集合中的元素对应不上，就会发生异常
                如果使用迭代器中的remove方法，那么在迭代器中的元素被删除后同样集合中的元素也会被删除
            结论：
                当集合中的元素和结构发生改变时，必须调用新的迭代器（相当于更新拷贝的集合）
                在迭代元素的过程中，删除元素时一定要调用迭代器的remove方法
             */
            System.out.println(obj);
        }
        System.out.println(c2.size()); // 0


    }
}
