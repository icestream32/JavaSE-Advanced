package 集合.Map;

import java.util.*;

public class MapTest01 {
    /*
    Map集合介绍：
        Map集合中有key和value两种数据，俗称键值对。
        Map中的数据会自动从小到大排序，称为可排序集合。
        个人理解：感觉Map像数学中的映射，也不太像。。。。
    java.util.Map接口中常用方法：
        1.Map和Collection没有继承关系。
        2.Map集合是以key和value的形式存储数据：
            key和value都是引用数据类型
            key和value都是存储对象的内存地址
            单独把key拿出来就就是Set集合
            key在Map集合中占据主导地位，value只不过是附属品
        3.常用方法：
            void clear() 
            boolean containsKey​(Object key) 
            boolean containsValue​(Object value) 
            Set<Map.Entry<K,​V>> entrySet() 
            V get​(Object key) 
            boolean isEmpty() 
            Set<K> keySet() 
            V put​(K key, V value) 
            V remove​(Object key) 
            int size() 
     */
    public static void main(String[] args) {

        // 创建一个Map对象
        // <>从前往后分别是key、value的泛型类型
        Map<Integer,String> map = new TreeMap<>();

        // 往Map集合中添加元素
        map.put(1, "zhangsan"); // 自动装箱
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "laojiu");

        // 查找集合中是否包含有某个key值
        System.out.println(map.containsKey(1)); // true
        System.out.println(map.containsValue("5")); // false

        // 查找集合中是否包含有某个value值
        System.out.println(map.containsValue("laojiu")); // true
        System.out.println(map.containsValue("laoba")); // false

        // 通过key值返回value值
        System.out.println(map.get(4)); // laojiu

        // 返回Map集合中所含有键值对数
        System.out.println(map.size()); // 4

        // 将Map集合转变为Set集合（实际上是把key单独拿出来而已）
        // Set中的泛型类型和定义Map是定义的key泛型类型一致
        Set<Integer> set1 = map.keySet();
        // 使用foreach遍历Set集合
        for (Object object : set1) {
            System.out.print(object); // 1234
        } 
        System.out.println();

        // 将Map集合转变为Set集合
        Set<Map.Entry<Integer,String>> set2 = map.entrySet();
        // 输出结果略微nb！
        System.out.println(set2); // [1=zhangsan, 2=lisi, 3=wangwu, 4=laojiu]

        // 通过key值移除Map集合中特定的元素
        map.remove(4);
        System.out.println(map.size()); // 3

        // 清空Map集合元素
        map.clear();
        System.out.println(map.size()); // 0

        // 判断集合是否为空
        System.out.println(map.isEmpty()); // true

    }    
}
