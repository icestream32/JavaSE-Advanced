package 集合.Collection;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;

/*
ArrayList特殊构造方法
    ArrayList​(Collection<? extends E> c) 
    按照集合的迭代器返回的顺序构造一个包含指定集合元素的列表。
    可以将一个非ArrayList集合转换成ArrayList集合 
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        
        Collection<Object> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        // 转换成ArrayList集合
        ArrayList<Object> s1 = new ArrayList<>(s);
        for (int i = 0; i < s1.size(); i++) {
            System.out.println(s1.get(i));
        }

    }   
}
