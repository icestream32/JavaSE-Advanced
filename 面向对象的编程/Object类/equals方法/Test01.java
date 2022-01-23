package 面向对象的编程.Object类.equals方法;
//用于学习equals()方法的使用
public class Test01 {
    /*
        1.源代码上equals()方法的默认实现为：
            public XObject operate(XObject left, XObject right)
                throws javax.xml.transform.TransformerException
            {
                return left.equals(right) ? XBoolean.S_TRUE : XBoolean.S_FALSE;
            }
            结果返回布尔类型值。
        2.如果是普通变量我们可以直接用euquals中的"=="比较两个变量是否相等,但放到类里却是比较引用值的内存地址
            而通常两个对象相等一般是比较对象里面的实例变量是否相等，因此我们需要重写equals方法
        3.我们在项目开发的过程中都要重写此类方法
        4.Java中所有普通数据类型都不需要使用equals方法来比较，但是所有引用数据类型都需要equals方法来比较
        5.特例：String类中已经重写了toString方法和equals方法，不需要再重写，直接引用就可以了
    */
    public static void main(String[] args) {
        
        MyTime a = new MyTime(2021,1,20);
        MyTime b = new MyTime(2021,1,20);
        System.out.println(a.equals(b));//true

        MyTime c = new MyTime(1970,1,1);
        System.out.println(c.equals(null));//false

        System.out.println(c.equals(b));//false
        System.out.println(a.equals(a));//true

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

    /* 
    VS Code源代码操作自动生成equals()方法
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyTime other = (MyTime) obj;
        if (date != other.date)
            return false;
        if (month != other.month)
            return false;
        if (year != other.year)
            return false;
        return true;
    } 
    */

    //重写equals()方法
    public boolean equals(Object obj) {
        
        //如果对象为空或者对象不是和当前对象一个类型的，直接返回false
        if(obj == null || !(this instanceof MyTime)) return false;
        
        //如果对象就是当前对象，直接返回true
        if(this == obj) return true;
        
        //剩下的情况就是和当前对象类型，但是不同的对象的情况，直接向下转型强制转换
        MyTime mt = (MyTime)obj;
        //判断对象是否相等
        return this.year == mt.year && this.month == mt.month && this.date == mt.date;

    }

}
