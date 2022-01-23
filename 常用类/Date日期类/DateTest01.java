package 常用类.Date日期类;

import java.util.*;
import java.text.*;

// 用于测试Java语言中日期类的使用
public class DateTest01 {
    /* 
        - 日期类在java.util包中，需要import引入
        - 获取当前日期：Date nowTime = new Date(); 输出引用即可
        - 设置日期格式:需要用到java.text包下SimpleDateFormat()
            在构造方法中格式如下：
            (区分大小写)
            yy ----- 年
            MM ----- 月
            dd ----- 日
            HH ----- 时
            mm ----- 分
            ss ----- 秒
            SSS ----- 毫秒
            注意：除了一些特定字符不能乱填，其他可以任意设置，详情参见下面程序
            具体格式参考JDK帮助文档
        - Date日期类型转换成String日期类型
        - String日期类型转换成Date日期类型
     */
    public static void main(String[] args) throws ParseException {

        Date nowTime = new Date();
        System.out.println(nowTime);// 打印系统当前日期 Sun Jan 23 17:15:22 HKT 2022

        // 然而这不是中国人习惯的日期格式，需要我们进行自定义
        // Date日期类型转换成String日期类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss SSS"); // 2022/01/23 17:21:20 579
        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd HH:mm:ss"); // 22-01-23 17:23:31
        String nowTimeStr2 = sdf2.format(nowTime);
        System.out.println(nowTimeStr2);

        // String日期类型转换成Date日期类型
        String time = "2008-08-08 08:08:08 888";
        // 前后日期格式要对，不然就会产生抛出异常 java.text.ParseException
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf3.parse(time));

    }
}
