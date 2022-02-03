package IO流;

import java.io.Serializable;

public class User implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = -4434770841450987026L;
    private String name;
    private int age;
    private transient int num;

    public User() {
    }

    public User(String name, int age, int num) {
        this.name = name;
        this.age = age;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", name=" + name + ", num=" + num + "]";
    }

    

}
