package 常用类.Packaging;

//用于测试Integer类中方法的使用
public class IntegerTest03 {

    public static void main(String[] args) {

        // 1.int intValue()
        // 返回此值 Integer为 int 。
        Integer i = 100;
        int j = i.intValue();
        System.out.println(j + 20);

        // 2.static int parseInt​(String s)
        // 将字符串参数解析为带符号的十进制整数。
        String a = "123";
        System.out.println(Integer.parseInt(a) + 100);
        /*
         * String b = "中国";
         * //使用该方法字符串必须为数字字符串，不然运行的时候就会报错
         * System.out.println(Integer.parseInt(b) + 100); //
         * java.lang.NumberFormatException 数字格式转换异常
         */

    }

}