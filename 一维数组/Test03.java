package 一维数组;
//用于测试引用型一维数组的使用
public class Test03 {
    /*
        - 在引用型数组中只能放同类型的引用，但也可以放具有继承关系的子类和父类 
     */
    public static void main(String[] args) {
        
        //向上转型
        //向上转型中最万能的是Obj类数组，但是为了演示这里选择Animal类数组
        Animal c1 = new Cat();
        Animal b1 = new Bird();
        //建立一个引用型数组
        Animal[] cb1 = {c1,b1};
        //遍历数组
        for (int i = 0; i < cb1.length; i++) {
            cb1[i].move();
        }
        
        //向下转型
        //向下转型需要注意继承关系问题，需要用instanceof判断
        Cat c2 = new Cat();
        Bird b2 = new Bird();
        //建立一个引用型数组
        Animal[] cb2 = {c2,b2};
        //遍历数组
        for (int i = 0; i < cb2.length; i++) {
            //这个取出来的可能是Cat，也可能是个Bird，不过肯定是一个Animal
            //如果调用的方法是父类中存在的方法不需要向下转型。直接使用父类型引用调用即可。
            if (cb2[i] instanceof Cat){
                //强制转换成一个新的猫对象
                Cat cat = (Cat)cb2[i];
                cat.eat();
            }
            if (cb2[i] instanceof Bird){
                //强制转换成一个新的鸟对象
                Bird bird = (Bird)cb2[i];
                bird.sing();
            }
        }

    }

}

//动物类父类
class Animal {
    public void move(){
        System.out.println("动物在动！");
    }
}

//猫类子类
class Cat extends Animal {
    public void move(){
        System.out.println("猫在走猫步！");
    }
    public void eat(){
        System.out.println("猫在吃鱼！");
    }
}

//鸟类子类
class Bird extends Animal {
    public void move(){
        System.out.println("Bird Fly！");
    }
    public void sing(){
        System.out.println("鸟儿在唱歌！");
    }
}
