package 常用类.Enum枚举类;
// 枚举类型的使用
public class EnumTest {
    /**
     * 枚举也是一个引用数据类型
     * 枚举的基本语法：
     *  enum 变量名 {
     *  枚举名1，枚举名2，...
     *  枚举应用场景：
     *  当返回结果只有两种可能时，建议使用布尔类型。
     *  当返回结果超过两种时，建议使用枚举类型
     * }
     */
    public static void main(String[] args) {
        switch (Season.SPRING){
            case SPRING : 
                System.out.println("春天");
                break;
            case SUMMER :
                System.out.println("夏天");
                break;
            case FALL :
                System.out.println("秋天");
                break;
            case WINTER :
                System.out.println("冬天");
                break;
        }
    }
}
