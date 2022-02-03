package IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 目录拷贝
public class CopyAll {
    public static void main(String[] args) {
        
        // 源目录
        File srcDir = new File("D:\\JavaDevelopment\\code");

        // 目标目录
        File desDir = new File("C:\\Users\\16013\\Desktop\\College");

        // 拷贝目录
        copyDir(srcDir,desDir);

    }

    private static void copyDir(File srcDir, File desDir) {
        // 递归停止条件：当子目录下全为文件就停止递归
        if (srcDir.isFile()) {
            // srcFile是如果是一个文件的话，递归结束
            // 是文件的话需要拷贝
            // 利用FileInputSrteam类和FileOutputStream类拷贝文件
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                in = new FileInputStream(srcDir);
                // 获得拷贝路径目录
                String srcStr = srcDir.getAbsolutePath().substring(18);
                String detStr = desDir.getAbsolutePath() + srcStr;
                out = new FileOutputStream(detStr);

                byte[] bytes = new byte[1024 * 1024]; // 一次赋值1MB
                int readCount = 0;
                while ((readCount = in.read(bytes)) != -1) {
                    out.write(bytes,0,readCount);
                }
                // 刷新流
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        // 获取当前子目录列表
        File[] files = srcDir.listFiles();
        // foreach遍历子目录中的子目录
        for (File file : files) {
            // 测试输出目录和文件
            // System.out.println(file.getAbsolutePath());
            // 判断当前file是否是目录
            if (file.isDirectory()) {
                // System.out.println(file.getAbsolutePath());
                // 截取当前目录字符串
                String srcStr = file.getAbsolutePath().substring(18);
                // 测试输出截取目录
                // System.out.println(srcStr);
                // 将字符串拼接到目标目录
                String detStr = desDir.getAbsolutePath() + srcStr;
                // 测试输出拼接目录
                // System.out.println(detStr);
                // 新建对应的目录
                File detFile = new File(detStr);
                if (!detFile.exists()) {
                    detFile.mkdirs();
                }
            }
            // 递归目录
            copyDir(file,desDir);
        }
    }
}
