package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

// 标准输出流
// 标准输出流可以在单独的一个日志工具类里打印日志文件，用于查看使用记录
public class PrintStreamTest {
    public static void main(String[] args) {
        
        // 在以前的学习中，我们都是将输出结果打印到控制台
        System.out.println("HelloWorld!");

        // 那么标准输出流可以改变System.out.Print的打印方向
        // 例如，标准输出流不再指向控制台，指向“log”文件。
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new FileOutputStream("IO流/log.txt",true));
            // 修改输出方向，将输出方向修改到“log”文件
            System.setOut(printStream);
            System.out.println("HelloWorld!!!");
            // 可以看到打印台不再输出第二个HelloWorld而是输出到了log文件里
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
