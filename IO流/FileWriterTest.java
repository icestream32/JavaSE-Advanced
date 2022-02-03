package IO流;

import java.io.FileWriter;
import java.io.IOException;

// 字符流相关类的使用
public class FileWriterTest {
    public static void main(String[] args) {
        
        FileWriter fw = null;
        // 给定一个字符数组
        char[] chars = {'我','是','中','国','人'}; 
        // 在后面加个true，确保已经存在的文件不会被清空再写入
        try {
            fw = new FileWriter("IO流/fileWrite",true);
            fw.write(chars);
            fw.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
