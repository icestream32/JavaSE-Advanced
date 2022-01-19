package Interface接口;

interface Interface {
    //常量
    double PI = 3.1415926;
    //抽象方法
    int sumInt(int a,int b);
}
class a implements Interface{
    //在接口外需要声明方法为公开
    public int sumInt(int a,int b){
        return a + b;
    }
}