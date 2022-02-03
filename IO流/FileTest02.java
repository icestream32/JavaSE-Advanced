package IO流;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        
        File f1 = new File("D:\\JavaDevelopment\\HelloWorld.java");

        // String getName() 
        // 获取文件名
        System.out.println("文件名：" + f1.getName()); // HelloWorld.java

        // boolean isDirectory() 
        // 判断是否是一个目录
        System.out.println(f1.isDirectory()); // false

        // boolean isFile() 
        // 判断是否是一个文件
        System.out.println(f1.isFile()); // true

        // 获取文件最后一次修改时间
        long haoMiao = f1.lastModified(); // 这个毫秒是从1970年到现在的毫秒总数。
        // 将总毫秒数转换成日期
        Date time = new Date(haoMiao);
        // 简化日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(time)); // 2022-01-18 19:26:48

        // long length() 
        // 获取文件大小
        System.out.println(f1.length()); // 125


    }
}
