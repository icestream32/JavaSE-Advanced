package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
上一个程序的缺点：
    硬盘和内存频繁交互，很大程度上影响效率。
优化方法：
    int read​(byte[] b) 从此输入流 b.length最多 b.length字节的数据读 b.length字节数组。 
    该方法会根据byte数组长度依次读文件中的字节。
    例如（以abcdef，byte数组长度为4为例）：
        第一次：（返回字节）abcd
        第二次：（返回字节）efcd
        第三次：文件中已经没有还没有读的字节，返回-1
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        
        FileInputStream file = null;
        try {
            // 这里使用的是相对路径
            // VS Code的默认路径是打开的文件夹根目录
            // IDEA的默认路径是打开的项目（Project）的根
            file = new FileInputStream("HelloWorld.java");

            // 准备一个byte数组
            byte[] bytes = new byte[4];

            // 可读性强的代码
            /* while (true) {
                int readCount = file.read(bytes);
                if (readCount == -1) {
                    break;
                } 
                // 把byte数组转换成字符串，读到多少个转换成多少个
                // String​(byte[] bytes, int offset, int length) 
                // 通过使用平台的默认字符集解码指定的字节子阵列来构造新的 String。 
                System.out.print(new String(bytes,0,readCount));
            } */

            // 简洁的代码
            int readCount = 0;
            while ((readCount != file.read(bytes))) {
                System.out.print(new String(bytes,0,readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
