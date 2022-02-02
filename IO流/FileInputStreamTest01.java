package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 学习文件输入流的使用
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        
        // 创建文件输入流对象
        FileInputStream file = null;
        // 这里会有文件未找到异常，在main方法里需要进行捕捉
        try {
            // 打开输入流管道
            // 这样写是Windows专属文件路径
            // file = new FileInputStream("D:\\JavaDevelopment\\JavaSE Advanced\\IO流\\test.txt");

            // 这个正斜杠文件路径是各个系统通用的
            file = new FileInputStream("D:/JavaDevelopment/JavaSE Advanced/IO流/test.txt");
            // 下面的代码就是处理文件中的数据
            // read()方法返回int类型数据，如果文件到达末尾，则返回-1
            // 这个read方法也有IOException异常，需要捕捉
            System.out.println(file.read());

            // 可以使用循环将文件中的所有字符读取
            int readData = 0;
            while ((readData = file.read()) != -1) {
                System.out.println(readData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try { // file.close方法会有IOException异常，同样需要进行捕捉
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
