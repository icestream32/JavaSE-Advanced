package 集合.Collection;

import java.util.ArrayList;
import java.util.Collection;

// 深入研究Collection接口当中的contains方法
public class CollectionTest03 {
    public static void main(String[] args) {
        Collection<Object> c = new ArrayList<>();
        c.add("abc");
        String s1 = "abc";
        String s2 = "def";
        // 以下代码输出什么？
        System.out.println(c.contains(s1) + s2); // true
        /*
        contains方法底层的代码调用的是equals方法
        因此在和String类型比较时，实际上调用的是equals方法
        而String类的equals方法已经被重写，比较的是字符串常量池里的内容
        因此返回true
         */

        //  而以下例子打印输出却为false
        
        /* 
        User u1 = new User("abc");
        c.add(u1);
        User u2 = new User("abc");
        System.out.println(c.contains(u2)); // false
        原因：该类没有重写equals方法，这里默认调用的equals方法是Object类中的方法
        结论：在集合中的对象所对应的类，一定要重写equals方法
        */
        User u1 = new User("abc");
        c.add(u1);
        User u2 = new User("abc");
        System.out.println(c.contains(u2)); // true
    }
    
}
class User {
    private String name;
    public User() {
        
    }
    public User(String name) {
        this.name = name;
    }
    // 重写equals方法
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
}