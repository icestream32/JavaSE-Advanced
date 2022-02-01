package 集合.Map;

public class Student {
    
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

    // 重写equals方法
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Student)) return false;
        if (this == obj) return true; 
        Student stu = (Student)obj;
        return this.name.equals(stu.name);
    }
    
    

}
