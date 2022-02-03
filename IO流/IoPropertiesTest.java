package IO流;

import java.io.FileInputStream;
import java.util.Properties;

// IO流与Properties集合的联合运用
/*
非常好的设计理念：
    以后经常需要改变的数据，可以单独写到一个文件中，使用程序动态读取。
    将来只要需要修改这个文件的内容，Java代码不需要带动，不需要重新编译，
    服务器也不需要重启。就可以拿到动态的信息。

    类似于以上机制的这种文件被称为配置文件。
    并且当配置文件中的内容格式是：
        key1=value
        key2=value
    的时候，我们把这种配置文件叫做属性配置文件。
    Java文件规范有要求：属性配置文件以.properties结尾，但这不是必须的。
    这种以.properties结尾的文件在Java中被称为：属性配置文件。
    其中Properties对象是专门存放属性配置文件内容的一个类。
 */
public class IoPropertiesTest {
    public static void main(String[] args) throws Exception{
        
        // 在Java中，默认配置文件是以.properties结尾的
        FileInputStream fis = new FileInputStream("IO流/userinfo.properties");

        // 新建一个Properties集合
        Properties pro = new Properties();

        // 调用Properties对象的load方法将文件中的数据加载到Map集合中
        pro.load(fis);
        System.out.println(pro.get("username"));
        System.out.println(pro.get("password"));

        fis.close();
    }
}
