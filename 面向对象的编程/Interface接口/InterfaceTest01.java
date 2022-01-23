package 面向对象的编程.Interface接口;
//用于测试接口
public class InterfaceTest01 {
    /*
        - 接口是完全抽象的类，抽象类是半抽象的类
        - 接口类体里没有变量只有常量，没有方法体只有抽象方法
        - 接口默认为公开类，因此可以不加public
        - 接口的语法
            interface 【接口名】 {}
        - 接口中的常量前缀static final可以忽略不写
        - 接口中的方法只能为抽象方法
        - 接口中的方法默认公开和抽象，因此public abstract可以忽略不写
        - 子类继承时需要用implements
        - 一个类可以继承多个接口
        - extends和implements可以共存，且extends在前,implements在后
    */
    public static void main(String[] args) {
        a b = new a();
        System.out.println(b.sumInt(10, 10));
    }
}
