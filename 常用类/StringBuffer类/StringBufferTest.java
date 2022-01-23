package 常用类.StringBuffer类;
// 用于测试字符串拼接类StringBuffer类的使用
public class StringBufferTest {
    /*
        - 由于SUM公司给字符串在JVM方法区中添加了字符串常量池，因此每个字符串使用过后是不会被回收的
        - 因此在涉及到字符串拼接时，会有大量的中间字符串产生，大大浪费空间内存
        - 使用StringBuffer类可以创建一个字符串缓冲区，省略掉中间字符串，大大减少内存
        - 基础语法：
            - StringBuffer() 构造一个字符串缓冲区，其中没有字符，初始容量为16个字符。 
            - StringBuffer​(int capacity) 构造一个字符串缓冲区，其中没有字符和指定的初始容量。 
            - StringBuffer​(CharSequence seq) 构造一个字符串缓冲区，其中包含与指定的 CharSequence相同的字符。 
            - StringBuffer​(String str) 构造一个初始化为指定字符串内容的字符串缓冲区。 
        - 如何优化StringBuffer类？
            - 在创建StringBuffer类时，尽量给定一个缓冲区初始容量
            - 在拼接字符串之前，尽量预估一个合适的缓冲区初始容量，不能太大也不能太小
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // 初始容量为16
        sb.append("10");
        sb.append("str");
        sb.append("true");
        // 输出引用时会自动调用toString方法
        System.out.println(sb); // 10strtrue
    }
    
}
