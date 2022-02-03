package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

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
5.序列化版本号有什么作用？
    java.io.InvalidClassException: IO流.Student; 
    local class incompatible: stream classdesc serialVersionUID = 1
    local class serialVersionUID = 2903749698400966710
    
    Java语言中国是采用什么机制来区分类的？
        第一：首先通过类名进行比对，如果类名不一样，肯定不是同一个类。
        第二：如果类名一样，再怎么进行类的区别？靠序列化版本号进行区分。
    如果不同的人编写了同一个类，但"这两个类却是不是同一个类"。这时候序列化版本就起上作用了。
    对于Java虚拟机来说，Java虚拟机是可以区分开这两个类的，因为这两个类都实现了Serializable接口，
    都有默认的序列化版本号，他么的序列化版本号不一样，所以区分开了。（这就是自动生成序列化版本号的好处）

    自动生成的序列化版本号的缺陷：
        这种自动生成的序列化版本号缺点是：一旦代码确定后，就不能进行后续的修改，
        因为只要修改，必然会重新编译，此时会生成全新的序列化版本号，这个时候java
        虚拟机就会以为这是一个全新的类。（这样就不好了！）
    
    最终结论：
        凡是一个类实现了Serializable接口，建议给该类提供一个固定不变的序列化版本号。
        这样，以后这个类即使代码修改了，但是版本号不变，Java虚拟机会认为是同一个类。
 */
public class ObjectInputStreamTest01 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("IO流/students"));
            // 序列化多个对象
            // 可以将接受到的Object类型向下转型成集合类型，遍历输出即可
            List<Student> lStudents = (List<Student>)ois.readObject();
            for (Student student : lStudents) {
                System.out.println(student);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
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
