package 异常处理;

// Java面试题
public class ExceptionTest04 {
    // 以下程序的输出结果是：
    public static void main(String[] args) {
        
        System.out.println(m()); // 100  

    }
    /*
        Java中有这样一条语法规则：
            方法体中的代码必须遵循自上而下的顺序依次执行（亘古不变的语法！）
        Java中还有这样的一条语法规则：
            return语句一旦执行，整个方法体必须结束（亘古不变的语法！）
            
     */

    private static int m() {
        int i = 100;
        // 这行代码出现在int i = 100;的下面，所以最终执行结果必须是返回100
        // return语句还必须是保持最后执行的。一旦执行，方法体结束。
        try {
            return i;
        } finally {
            i++;
        }
    }   
}
/*
    .class文件中方法m()反编译结果：
    private static int m() {
        byte i = 100;
        byte var1;
        try {
            var1 = i;
        } finally {
            int var5 = i + 1;
        }
        return var1;
    }
    可见最终返回值为100
 */
