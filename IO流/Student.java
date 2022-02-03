package IO流;

import java.io.Serializable;

// 序列化所在的类必须要实现Serializable接口
public class Student implements Serializable {
    
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }
    

}
