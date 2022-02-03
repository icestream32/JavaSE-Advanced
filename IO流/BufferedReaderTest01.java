package IO流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
BufferReader:
    带有缓冲区的字符输入流。
    使用这个流的时候不需要自定义char数组，或者说不需要定义byte数组，自带缓冲。
*/
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        
        FileReader reader = null;
        // 创建一个缓冲流对象
        BufferedReader br = null;
        try {
            reader = new FileReader("HelloWorld.java");
            // 当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
            // 外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流
            // 像当前的这个程序来说：FileReader就是一个节点流，BufferReader就是包装流。
            br = new BufferedReader(reader);

            /* // 读一行
            // 缓冲流中都带有这样一个方法：readLine方法
            // 该方法能返回一行读到的字符串，如果已经读完则返回null
            // 对于程序员来说这样能简化代码操作，但从速度上来说还是字节流、字符流输入比较快
            String firstLine = br.readLine();
            System.out.println(firstLine); // public class HelloWorld { */

            // 通过循环读取文件全部字符
            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭流
                // 对于包装类来说，只需要关闭最外层流机型，里面的节点流就会自动关闭。（可以看源代码）
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
