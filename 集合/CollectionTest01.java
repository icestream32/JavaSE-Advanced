package 集合;
// 集合的老祖宗Colletion的常用方法

import java.util.ArrayList;
import java.util.Collection;
/*
    集合的定义：
    - 集合中不能直接存储基本数据类型，存储对象的地址
    - 集合继承结构图要牢记
    - 集合有两大部分，一个是Collection下的所有实现类，另一个是Map下的所有实现类
 */
/*
    Collection类常用方法
    1.boolean add​(Object e) 往集合中添加元素
    2.void clear() 从此集合中删除所有元素 
    3.boolean contains​(Object o) 如果此collection包含指定的元素，则返回 true
    4.boolean isEmpty() 如果此集合不包含任何元素，则返回 true
    5.boolean remove​(Object o) 从此集合中移除指定元素的单个实例（如果存在） 
    6.int size() 返回此集合中的元素数
 */
public class CollectionTest01 {
    public static void main(String[] args) {

        // Collection是接口不能实例化对象，需要利用多态性调用
        Collection c = new ArrayList();
        // 基本数据类型在集合中以包装类的形式存在
        // 自动装箱
        c.add(1200);
        c.add(true);
        c.add("e");
        c.add("绿巨人");

        System.out.println(c.size()); // 4
        
        c.clear();

        c.add("中国农业大学");
        c.add("45");

        System.out.println(c.contains("45")); // true
        System.out.println(c.contains("农大")); // false
        
        System.out.println(c.isEmpty()); // false

        c.add("农大");
        System.out.println(c.remove("农大")); // true
        System.out.println(c.remove("农大")); // false

    }
    
}
