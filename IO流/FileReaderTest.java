package IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 字符流的使用
public class FileReaderTest {
    public static void main(String[] args) {
        
        FileReader fr = null;
        // 字符流需要创建字符数组
        char[] cr = new char[4];
        try {
            fr = new FileReader("IO流/fileReader");
            int readCount = 0;

            while ((readCount = fr.read(cr)) != -1) {
                // 还是使用new String的字符构造方法截取当前读取的部分输出
                // 不知为何这玩意读中文会乱码
                System.out.print(new String(cr,0,readCount));                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
