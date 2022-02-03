package IO流;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

// 通过转换流将字符流和字节流转换成缓冲流
public class BufferedReaderTest02 {
    public static void main(String[] args) {
        
        // 字节流
        FileInputStream in = null;
        // 转换流
        InputStreamReader reader = null;
        // 缓冲流
        BufferedReader br = null;

        try {
            in = new FileInputStream("HelloWorld.java");
            // 通过转换流转换（InputStreamReader将字节流转换成字符流）
            // 在这里，in是节点流。br是包装流。
            reader = new InputStreamReader(in);

            // 这个构造方法只能传一个字符路，不能传字节流。
            // reader是字节流。br是包装流。
            br = new BufferedReader(reader);

            // 输出结果
            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
