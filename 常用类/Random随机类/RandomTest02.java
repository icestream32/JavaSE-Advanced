package 常用类.Random随机类;
// 小作业：在[0,100]中生成5个不重复的随机数,并放入数组输出
import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args) {
        
        // 初始化数组
        int[] array = new int[5];
        // 创建一个随机数对象
        Random arrayRandom = new Random();
        // 将数组默认值改为-1
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        
        int index = 0;
        while (index < array.length) {
            // 生成随机数
            int num = arrayRandom.nextInt(6);
            // 判断这个数组中有没有num
            if (!contains(array, num)) {
                array[index++] = num;
            }

        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
    }   
    // 二分法查找数组中相同的元素
    public static boolean contains(int[] arr,int key) {
        for (int i = 0; i < arr.length; i++) {
            // 条件成立，代表包含
            if (arr[i] == key)  return true;
        }
        return false;
    }
}
