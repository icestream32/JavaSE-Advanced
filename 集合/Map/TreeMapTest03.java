package 集合.Map;

import java.util.*;
/* 
TreeSet集合中元素可排序的第二种方式:使用比较器的方式
最终的结论：
    放在TreeSet或者TreeMap集合中key部分的元素想要做到排序，包括以下两种方式：
        第一种：放在集合中的元素实现java.lang.Compaarable接口。
        第二种：在构造TreeSet或者TreeMap集合的时候给它传一个比较器对象。
Comparable和Comparator怎么选择呢？
    当比较规则不会发生改变的时候，或者说当比较规则只有1个的时候，建议实现Comparable接口。
    如果比较规则有多个，并且需要多个比较规则之间频繁切换，建议使用Comparator接口。
    Comparator接口的设计符合OCP原则。
 */
public class TreeMapTest03 {
    public static void main(String[] args) {
        
        WuGui wuGui1 = new WuGui(800);
        WuGui wuGui2 = new WuGui(700);
        WuGui wuGui3 = new WuGui(1000);
        // 给构造方法传递一个比较器
        Set<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());
        // 也可以通过匿名内部类的形式实现比较器比较
        /* Set<WuGui> wGuis = new TreeSet<>(new Comparator<WuGui>() {

            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o1.getAge() - o2.getAge();
            }
            
        }); */
        wuGuis.add(wuGui1);
        wuGuis.add(wuGui2);
        wuGuis.add(wuGui3);

        for (WuGui wuGui : wuGuis) {
            System.out.println(wuGui);
        }

    }
}

class WuGui {

    private int age;

    public WuGui() {
    }

    public WuGui(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "乌龟 [年龄=" + age + "]";
    }

}

class WuGuiComparator implements Comparator<WuGui> {

    @Override
    public int compare(WuGui o1, WuGui o2) {
        return o1.getAge() - o2.getAge();
    }
    
} 
