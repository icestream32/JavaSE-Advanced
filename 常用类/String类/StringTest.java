package 常用类.String类;

// 用于测试String类中的各种方法的使用
public class StringTest {

    public static void main(String[] args) {

        // 1.char charAt​(int index)
        // 返回指定索引处的 char值。
        char chars = "我是中国人".charAt(3);
        System.out.println(chars); // 国

        // 2.int compareTo​(String anotherString)
        // 按字典顺序比较两个字符串。返回值为-25~25 ASCII码
        System.out.println("abcd".compareTo("abcd")); // 0
        System.out.println("abcd".compareTo("abce")); // -1
        System.out.println("abce".compareTo("abcd")); // 1
        // 当比较到第一个字符不相等时停止比较
        System.out.println("xyz".compareTo("yxz")); // -1

        // 3.String concat​(String str)
        // 将指定的字符串连接到此字符串的末尾。
        System.out.println("我是".concat("中国人"));

        // 4.boolean contains​(CharSequence s)
        // 当且仅当此字符串包含指定的char值序列时，才返回true。
        System.out.println("https://www.Google.com".contains("www"));
        System.out.println("我是".contains("中国人"));

        // 5.boolean endsWith​(String suffix)
        // 测试此字符串是否以指定的后缀结尾。
        System.out.println("https://www.Google.com".endsWith("com"));
        System.out.println("我是".endsWith("中国人"));

        // 6.boolean equalsIgnoreCase​(String anotherString)
        // 将此 String与另一个 String比较，忽略了大小写。
        // 验证码登录估计用了这个方法
        System.out.println("adcD".equalsIgnoreCase("aDCd"));

        // 7.byte[] getBytes()
        // 使用平台的默认字符集将此 String编码为字节序列，将结果存储到新的字节数组中。
        byte[] bytes;
        String a = "abc";
        bytes = a.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
        System.out.println();

        // 8.void getChars​(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        // 将此字符串中的字符复制到目标字符数组中。
        char[] fuzhi = new char[3];
        String b = "我是中国人";
        // 复制区间为左闭右开
        b.getChars(2, 5, fuzhi, 0);
        for (int i = 0; i < fuzhi.length; i++) {
            System.out.print(fuzhi[i]);
        }
        System.out.println();

        // 9.boolean isEmpty()
        // 当且仅当length()是0时，返回 true。
        // 判断字符串长度是否为0，lenth()方法判断
        // 面试题，字符串长度使用lenth()方法判断，其他类型的是用lenth属性判断
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());

        // 10.String replace​(char oldChar, char newChar)
        // 用指定的文字替换序列替换此字符串中与文字目标序列匹配的每个子字符串。
        // 幻塔复制原神评论替换所需方法之一
        String c = "原神yyds";
        System.out.println(c.replace("原神", "幻塔"));

        // 11.String strip()
        // 返回一个字符串，其值为该字符串， 删除了所有前导和尾随空格。
        System.out.println("      Hello          World        ".strip());

        // 12.String substring​(int beginIndex)
        // 返回一个字符串，该字符串是此字符串的子字符串。
        String d = "我是中国人";
        System.out.println(d.substring(2));

        // 13.String toLowerCase() 使用默认语言环境的规则将此 String所有字符转换为小写。
        // String toUpperCase​(Locale locale) 使用给定 Locale的规则将此 String所有字符转换为大写。
        System.out.println("aDcB".toLowerCase());
        System.out.println("aDcB".toUpperCase());

        // 14.static String valueOf()
        // String类中唯一一个静态方法，可以将任何类型的数据转换成字符串
        // 究其System.out.println()方法的根本，也是通过valueOf方法转换成字符串再调用toString方法输出
        int ints = 5;
        System.out.println(String.valueOf(ints));

    }

}
