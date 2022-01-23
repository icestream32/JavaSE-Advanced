package 面向对象的编程.Interface接口;
public class InterfaceTest02 {
    //用于测试继承和实现同时存在的情况
    public static void main(String[] args) {
        //多态性
        //接口没法自己建立对象只能绑定多态建立子对象
        Flyable c = new Cat();
        c.fly();
        Animal p = new Pig();
        p.move();
    }
}
//定义一个接口，接口一般是行为方法
interface Flyable {
    void fly();
}
//定义动物类，父类
class Animal {
    public void move(){

    }
}
//继承自动物类，接口相当于插上翅膀，猫就会飞
class Cat extends Animal implements Flyable {
    public void fly(){
        System.out.println("我是一只会飞的猫！！");
    }
}
//继承自动物类，但猪没接口，因此不能飞
class Pig extends Animal {
    public void move(){
        System.out.println("我是猪我不会飞,只会跑！");
    }
}

