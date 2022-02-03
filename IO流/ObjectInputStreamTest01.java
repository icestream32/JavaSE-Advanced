package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/* import java.util.List; */

/*
1.java.io.NotSerializableException
    出现这条异常说明序列化的类没有实现Serializable接口
2.参与序列化和反序列化的对象，必须实现Serializable接口
3.注意：通过源代码发现，Serializable接口只是一个标志接口：
    public interface Serializable {
    }
    这个接口中什么代码都没有，
    它的作用是起到标识的作用，java虚拟机看到这个类实现了这个接口，可能会对这个类进行特殊待遇。
4.实现多个对象的序列化要求
    参与序列化的集合以及集合中的元素都需要实现java.io.Serializable接口
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) {
        
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("IO流/students"));
            // 序列化多个对象
            // 可以将接受到的Object类型向下转型成集合类型，遍历输出即可
            /* List<Student> lStudents = (List<Student>)ois.readObject();
            for (Student student : lStudents) {
                System.out.println(student);
            } */

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } /* catch (ClassNotFoundException e) {
            e.printStackTrace();
        } */ finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
