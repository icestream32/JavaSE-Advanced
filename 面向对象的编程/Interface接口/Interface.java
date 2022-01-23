package 面向对象的编程.Interface接口;

interface Interface {
    //常量
    double PI = 3.1415926;
    //抽象方法
    int sumInt(int a,int b);
}
interface Interface_b {

    int sumInt(int a,int b,int c);

}
class a implements Interface,Interface_b{
    //在接口外需要声明方法为公开
    //一个类可以继承多个接口
    public int sumInt(int a,int b){
        return a + b;
    }
    public int sumInt(int a,int b,int c){
        return a + b;
    }
}