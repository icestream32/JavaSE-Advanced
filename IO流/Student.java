package IO流;

import java.io.Serializable;

// 序列化所在的类必须要实现Serializable接口
public class Student implements Serializable {
    // Java虚拟机看到Serializable接口之后，会自动生成一个序列化版本号。
    // 如果没有手动写出来，Java虚拟机会默认提供这个序列化版本号。
    // 建议将序列化版本号手动的写出来。不建议自动生成
    private static final long serialVersionUID = 1L;
    
    private String name;

    // 如果过了很久，Student这个类源代码改动了。
    // 源代码改动后，需要重新编译，编译之后生成了全新的字节码文件。
    // 并且class文件再次运行的时候，Java虚拟机生成的序列化版本号也会发生相应的改变。
    private int age;
    private String address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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
        return "Student [address=" + address + ", age=" + age + ", name=" + name + "]";
    }
    

}
