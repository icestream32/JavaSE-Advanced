package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// 多个类的序列化
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) {

        // 如果涉及到多个类的话可以使用集合将类放入在进行序列化
        List<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan"));
        list.add(new Student("lisi"));
        list.add(new Student("wangwu"));
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("IO流/students"));
            oos.writeObject(list);
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
