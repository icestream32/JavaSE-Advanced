package IO流;

import java.io.File;

// File类中的listFiles方法
public class FileTest03 {
    public static void main(String[] args) {
        
        // File[] listFiles() 
        // 获取当前目录下所有的子文件。
        File f = new File("D:\\JavaDevelopment");
        File[] files = f.listFiles();
        // foreach
        for (File file : files) {
            // System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
        }

    }
}
