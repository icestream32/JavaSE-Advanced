package 常用类.Date日期类;
// 用于测试时间统计的使用
public class DateTest02 {
    public static void main(String[] args) {
        
        // 获取1970年1月1日0时0分0秒到现在所需的毫秒数
        // 调用System类方法System.currentTimeMillis()
        System.out.println(System.currentTimeMillis());

        // 因此我们可以使用此方法来统计程序运行时长
        // 在Java项目中我们也经常需要此方法来测试程序运行时间
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序所运行的时间为" + (end - begin) + "ms");

    }
    
}
