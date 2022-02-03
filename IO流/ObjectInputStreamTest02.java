package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// transient关键字
/*
    在序列化和反序列化的过程中，我们往往不想让某个数据序列化。
    这就需要transient关键字，
    它可以是的类中的属性和行为处于游离状态，序列化时自动跳过。
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) {
        
        User user = new User("张三", 22, 100);

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("IO流/users"));
            oos.writeObject(user);
            ois = new ObjectInputStream(new FileInputStream("IO流/users"));
            User ur = (User)ois.readObject();
            System.out.println(ur); // User [age=22, name=张三, num=0]
            // num值不会被输出，为默认值
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
