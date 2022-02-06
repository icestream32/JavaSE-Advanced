package 反射.bean;

public class Vip {
    
    public String name;
    public int number;
    public boolean sex;
    public String birth;

    public Vip() {
    }

    public Vip(String name) {
        this.name = name;
    }

    public Vip(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Vip(String name, int number, boolean sex) {
        this.name = name;
        this.number = number;
        this.sex = sex;
    }

    public Vip(String name, int number, boolean sex, String birth) {
        this.name = name;
        this.number = number;
        this.sex = sex;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Vip [birth=" + birth + ", name=" + name + ", number=" + number + ", sex=" + sex + "]";
    }
    
}
