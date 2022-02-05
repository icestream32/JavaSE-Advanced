package 多线程;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

// 定时器的实现
public class TimerTest {
    public static void main(String[] args) {

        // 定义用户线程计时对象
        Timer timer = new Timer();
        // 定义守护线程计时对象
        // Timer timer = new Timer(true);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime;
        try {
            String currentTime = sdf.format(new Date()); 
            firstTime = sdf.parse(currentTime);
            // 安排定时任务，设置起始时间为firstTime，每隔十秒执行一次
            timer.schedule(new LogTimeTask(), firstTime,10 * 1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}

// 编写定时任务类
// 假设这是一个记事本的定时任务
class LogTimeTask extends TimerTask {

    // 定时器需要完成的任务
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new Date());
        System.out.println(time + ":数据备份成功！");
    }

}