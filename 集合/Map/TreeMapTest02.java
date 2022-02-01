package 集合.Map;

import java.util.Set;
import java.util.TreeSet;

/*
对于自定义类型，TreeSet可以排序吗？
    一下成语对于Person类型来说，无法排序。
    因为没有指定Person对象之间谁大谁小的排序规则。

执行程序的时候出现以下异常：
    java.lang.ClassCastException: 
        class 集合.Map.Person cannot be cast to class java.lang.Comparable
    我们看到这条异常是在向下转型的情况发生的
    但是这里发生异常的原因是：
        Person类没有实现java.lang.Comparable接口
        
 */
public class TreeMapTest02 {
    public static void main(String[] args) {
        
        // 创建TreeSet对象
        Set<Person> persons = new TreeSet<>();
        
        Person p1 = new Person(32);
        Person p2 = new Person(22);
        Person p3 = new Person(21);
        Person p4 = new Person(20);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        // 遍历集合
        for (Person person : persons) {
            System.out.println(person.getAge() + " ");
        }  

    }
}

// 放在TreeSet集合中的元素需要实现java.lang.Comparable接口
// 并且实现compareTo方法。equals可以不写
class Person implements Comparable<Person> {

    private int age;

    public Person() {
    }

    public Person(int age) {
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
        return "Person [age=" + age + "]";
    }

    // 需要在这个方法中编写比较的逻辑
    // k.compareTo(t.key)
    // 拿着参数k和集合中的每一个k进行比较，返回值可能是>0 <0 =0
    // 比较原则最终还是由程序员指定的：例如按照年龄升序。或者按照年龄降序.
    /*
    compareTo的返回值很重要：
        返回0表示相同，value会覆盖。
        返回>0，会继续在右子树上查找。
        返回<0，会继续在左子树上查找。 
     */
    @Override
    public int compareTo(Person p) { // 
        /*
        比较方法遵循自平衡二叉树数据结构，源代码如下：
            这里的cmp指的是compareTo方法传入的int类型数据
            if (cpr != null) {
            Entry<K,V> p = root;
                while (p != null) {
                int cmp = cpr.compare(k, p.key);
                if (cmp < 0)
                    p = p.left;
                else if (cmp > 0)
                    p = p.right;
                else
                    return p;
                }
            }
        TreeSet集合采用的是：中序遍历方式。
        Iterator迭代器采用的是中序遍历方式。左根右
         */
        // 如果要以年龄升序顺序排序
        // 结果为负会放在二叉树左边，遍历的时候会优先遍历出来，达到排序目的。
        // return this.age - p.age;
        // 如果要以年龄降序排序
        return p.age - this.age;
    }

}