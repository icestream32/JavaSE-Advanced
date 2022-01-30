package 集合.Map;

import java.util.*;
import java.util.Map.Entry;

// Map集合的遍历方式【非常重要】
public class MapTest2 {
    public static void main(String[] args) {
        
        // 创建Map集合对象
        Map<Integer,String> map = new HashMap<>();
        // 向Map集合中添加元素
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

        // 第一种方式，通过获取key再获取value
        // 利用Map集合中的Set<K> keySet()将key值存储到Set集合中
        Set<Integer> keys = map.keySet();

        // 运用迭代器遍历Map集合
        // 这里获取的迭代器是keys的迭代器
        Iterator<Integer> it1 = keys.iterator();
        while (it1.hasNext()) {
            // 获取Set集合中的key值
            Integer key = it1.next();
            // 利用Map集合中的V get​(Object key)方法获取value值
            System.out.println(map.get(key));
        }
        System.out.println("=====================================================");
        // 运用foreach遍历Map集合
        for (Integer integer : keys) {
            // 利用Map集合中的V get​(Object key)方法获取value值
            System.out.println(map.get(integer));
        }

        // 第二种方式,通过Map接口中特殊的数据类型Map.Entry获取key和value值
        Set<Map.Entry<Integer,String>> entries1 = map.entrySet();
        // 运用迭代器遍历Map集合
        Iterator<Entry<Integer, String>> it2 = entries1.iterator();
        while (it2.hasNext()) {
            // 获取迭代器迭代/遍历的Map.Entry类对象
            Entry<Integer, String> node = it2.next();
            /*
            详细说明：
                这里的node都是Map.Entry类型Set集合中保存的对象地址
                对于Map.Entry类，具有以下常用方法：
                    K getKey() 返回与此条目对应的键。 
                    V getValue() 返回与此条目对应的值。  
                    int hashCode() 返回此映射条目的哈希码值。 
                    V setValue​(V value) 用指定的值替换此条目对应的值 
             */
            // 获取Map.Entry类对象中的key和value
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println("键" + key + "对应的值是" + value);
        }
        System.out.println("=====================================================");
        // 运用foreach循环输出
        Set<Map.Entry<Integer,String>> entries2 = map.entrySet();
        for (Entry<Integer,String> entry : entries2) {
            System.out.println("键" + entry.getKey() + "对应的值是" + entry.getValue());
        }
        /*
        总结：
            以上四种遍历Map集合方法都要理解、掌握并运用
            在之后的项目开发中，我们优先选择
                第四种方法：利用Map接口中特殊的数据类型Map.Entry获取key和value值之后通过foreach遍历得到
                这种方式key值和value值都作为node对象的属性一并输出
                这样调用效率高，内存占用少
         */

    }
}
