package 集合.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
泛型介绍：
    在集合遍历过程中，调用用next方法中得出的数据都是Object类数据
    因此我们在当我们需要进行向下转型时，往往要先将Object类转换成父类，再将父类转换成子类
    这样做很非常繁琐
    在JDK8之后，推出了泛型机制
    泛型优点：
        1.泛型可以使得集合的数据类型保持统一
        2.泛型可以解决上述遇到的问题，大大简化代码流程。
    泛型缺点：
        泛型使得集合缺少多样性。
    但泛型被人们所接受的原因是因为在今后的开发中，集合中的数据类型一般都是一种
 */
public class GenericTest {
    public static void main(String[] args) {
        
        // 创建一个集合对象，引用泛型
        // JDK1.5新特性，new后面的ArrayList泛型可以自动识别前面的泛型
        List<Animal> list = new ArrayList<>();
        // 添加泛型限制后list这个集合只能放Animal有关类对象了
        // 实例化Bird和Cat对象
        Animal c = new Cat();
        Animal b = new Bird();

        // 往集合中添加对象
        // 此时往list集合中添加其他对象会报错
        // list.add("e");
        list.add(c);
        list.add(b);

        // 创建迭代器
        // 迭代器一般也需要使用泛型，和集合泛型一致
        Iterator<Animal> it = list.iterator(); 
        while(it.hasNext()) {
            // 可以直接读取Animal相关类对象而不用经过Object类的向下转型
            Animal ani = it.next();
            // 在调用子类的特殊方法时，还是需要手动向下转型的
            if (ani instanceof Cat) {
                Cat cat = (Cat)ani;
                cat.move();
            }
            if (ani instanceof Bird) {
                Bird bird = (Bird)ani;
                bird.fly();
            }
        }

    }
}

class Animal {
    void move() {
        System.out.println("动物在移动！");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("鸟儿在飞！");
    }
}

class Cat extends Animal {
    void move() {
        System.out.println("猫在走猫步！");
    }
}
