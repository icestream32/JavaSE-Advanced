package Object类.toString方法;
//用于学习toString()方法
public class Test {
    /*
        1.源代码上toString()方法的默认实现为：
            getClass().getName() + '@' + Integer.toHexString(hashCode())
            结果返回对象的地址。
        2.通常，该 toString方法返回一个“以文本方式表示”该对象的字符串。
            结果应该是一个简洁但信息丰富的表示，易于人们阅读。
            建议所有子类重写此方法。
        3.我们在项目开发的过程中都要重写此类方法
    */
    public static void main(String[] args) {
        
        MyTime m = new MyTime(1970,1,1);
        //输出引用的时候，系统会默认调用toString()方法
        System.out.println(m);

    }
}
class MyTime {

    int year;
    int month;
    int date;

    public MyTime (){
        
    }

    public MyTime(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    //重写toString方法
    public String toString() {
        return  date + "/" + month + "/" + year;
    }

}
