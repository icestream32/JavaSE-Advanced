package 常用类.Random随机类;

import java.util.Random;

// 随机类的基本使用
public class RandomTest01 {
    public static void main(String[] args) {
        
        // 创建随机数对象
        Random rd = new Random();

        // 生成一个int范围内的随机数
        int random1 = rd.nextInt();
        System.out.println(random1);

        // 生成[0,100]的随机数
        int random2 = rd.nextInt(101);
        System.out.println(random2);

    }
}
