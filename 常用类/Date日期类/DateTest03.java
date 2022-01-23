package 常用类.Date日期类;

import java.util.Date;

// 用于测试有参日期的构造方法的时候
public class DateTest03 {
    /* 
        - Date类无参构造时，默认获取当前系统日期
        - Date类有参构造时，初始化它以表示自标准基准时间（称为“纪元”）以来的指定毫秒数，即1970年1月1日00:00:00 GMT。 
     */
    public static void main(String[] args) {
        
        // 获取昨天此时的日期
        Date strTime = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        System.out.println(strTime);

    }
}
