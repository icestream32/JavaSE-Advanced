package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream类的其他常用方法:
    int available() ：返回流当中剩余的没有读到的字节数量
    long skip​(long n) 跳过几个字节不读
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        
        FileInputStream file = null;
        try {
            
            file = new FileInputStream("IO流/test.txt");
            // acailable方法经常用于判断还没有读取时，文件中的字节数
            // 这个方法适用于文件大小所占用的字节数小于byte数据类型范围
            // 该方法也会产生IOException异常，在main方法中进行捕捉
            /* byte[] bytes = new byte[file.available()];
            System.out.println(new String(bytes,0,file.read(bytes))); // abcdef */

            // skip方法在之后的开发中也可能会用到
            file.skip(3);
            System.out.println(file.read()); // 100
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
