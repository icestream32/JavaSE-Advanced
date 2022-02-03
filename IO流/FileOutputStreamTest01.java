package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        
        FileOutputStream fos = null;
        try {
            // myfile文件不存在的时候会自动新建！
            // 这种初始化方式谨慎使用，这种方式会先将原文件清空，然后重新写入。
            // fos = new FileOutputStream("IO流/myfile");
            // 以追加的方式在文件末尾写入。不会清空原文件内容
            fos = new FileOutputStream("IO流/myfile",true);
            // 开始写
            byte[] bytes = {97,98,99,100};
            // 将byte数组全部写出！
            // 该方法也会有IOException异常，需要在main方法里捕捉
            fos.write(bytes); 
            // 将byte数组的一部分写出！
            fos.write(bytes,0,2); 
            // 测试
            // \n是换行符号，C语言中常用
            String s = "\n我是一个中国人，我骄傲！！！";
            byte[] bt = s.getBytes();
            fos.write(bt);

            // 输出流在结束之后一定要刷新，不然就会丢失数据！
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
