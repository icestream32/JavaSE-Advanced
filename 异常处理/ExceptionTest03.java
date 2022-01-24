package 异常处理;
// finally的使用
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest03 {
    /*
        - fially必须要和try绑定，表示最终的，一定的
        - 即使try和catch中程序运行因异常停止，finally中的程序也会运行
        -  
     */
    public static void main(String[] args) {
        
        // 创建文件流
        // 声明放在外面，这样finally才能用
        FileInputStream file = null;
        try {
            file = new FileInputStream("D:\\JavaDevelopment\\JavaS Advanced\\异常处理\\test.txt");
            // 文件输入中...
            /* String i = null;
            i.toString(); // 空指针异常！ */

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        
        } catch (NullPointerException e) {
            // catch可以设置多个 
            e.printStackTrace();
        } finally {
            // 关闭文件流
            // 由于上面的代码会出现空指针异常，程序执行到上面就不会再执行，因此文件流未能关闭，这样会占用内存
            // 因此需要将文件流放入finally中
            try {
                // IOException异常，我们选择直接处理
                // file也可能是null，因此需要加个判断，避免空指针异常
                if (file != null) file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        

        

    }
}
