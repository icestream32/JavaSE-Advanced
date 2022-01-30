package 集合.Collection;
// 自定义泛型的使用
// 可以定义任意类、任意方法自定义泛型
public class GenericTest02<在这里定义泛型> {
    /*
     - <>中可以放任何标识符，在这里只是起到标识作用
     - Java在<>中默认写T或E，T代表title，E代表element
     - 类一旦定义泛型，类中只要定义了泛型的方法都要和类的泛型类型一致
     */
    // 定义泛型方法
    public String doSome(在这里定义泛型 o) {
        return null;
    }

    public static void main(String[] args) {
        // 如果定义了泛型不写泛型类型的话，这里就会报黄色警告
        GenericTest02<String> c = new GenericTest02<>();
        // 在这里doSome方法如果不传入字符串的话就会出现异常
        c.doSome("2");
    }
}
