package 常用类.Abstract抽象类;
//用于测试抽象类
public class AbstractTest {
    /*
        - 抽象类是类中类，是类的抽象
        - 抽象类不能被实例化，只能被继承
        - 抽象类中不一定有抽象方法，但是抽象方法必须在抽象类中编写
        - 抽象类语法格式
            abstract class 【类名】{}
        - 抽象方法只能声明并以分号结尾，之后继承的子类必须重写/覆盖/实现从抽象类继承的方法 
    */
    public static void main(String[] args) {
        //多态性，面向抽象的编程
        Animal c = new Cat();
        c.move();
    }

    //动物抽象类
    static abstract class Animal {
        //因为内部静态方法不能访问动态类，因此内部类需要全部加上static关键字
        //抽象方法，动物的移动
        public abstract void move();

    }

    static class Cat extends Animal{
        //因为内部静态方法不能访问动态类，因此内部类需要全部加上static关键字
        //从抽象类继承过来的抽象方法必须要实现
        //不然就会报错误：
        //The type AbstractTest.Cat must implement the inherited abstract method AbstractTest.Animal.move()
        public void move(){
            System.out.println("猫在走猫步！");
        }
    }

    static class Bird extends Animal{
        //因为内部静态方法不能访问动态类，因此内部类需要全部加上static关键字
        //从抽象类继承过来的抽象方法必须要实现
        //不然就会报错误：
        //The type AbstractTest.Cat must implement the inherited abstract method AbstractTest.Animal.move()
        public void move(){
            System.out.println("鸟儿在飞翔！");
        }
    }
}
