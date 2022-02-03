package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 字节流文件拷贝操作
// 简单来说就是一边读一边写
public class Copy01 {
    public static void main(String[] args) {
        
        // 创建一个输入流对象
        FileInputStream fis = null;

        // 创建一个输出流对象
        FileOutputStream fos = null;

        // 初始化一个字节数组
        // 这个数组大小取决于需要拷贝文件的大小
        byte[] bytes = new byte[1024 * 1024]; // 1MB

        try {
            fis = new FileInputStream("D:\\JavaDevelopment\\JavaSE Advanced\\HelloWorld.java");
            fos = new FileOutputStream("D:\\JavaDevelopment\\JDK帮助文档\\HelloWorld.java");

            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1) {
                fos.write(new String(bytes,0,readCount).getBytes());
            }
            // 输出流在运行结束之后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // try最好分开放，因为一个发生异常可能会影响另一个运行
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
    
    }
}
