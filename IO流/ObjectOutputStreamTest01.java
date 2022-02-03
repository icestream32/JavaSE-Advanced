package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest01 {
    public static void main(String[] args) {
        
        // 创建java对象
        Student s1 = new Student("zhangsan");

        // 创建序列化对象
        ObjectOutputStream oos = null;
        // 序列化
        try {
            oos = new ObjectOutputStream(new FileOutputStream("IO流/students"));
            oos.writeObject(s1);
            // 所生成的students文件是一个二进制文件，打开看全是乱码
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos !=null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
