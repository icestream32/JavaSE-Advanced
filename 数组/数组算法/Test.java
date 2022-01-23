package 数组.数组算法;

import java.util.*;

// 用于测试arrays工具类的使用
public class Test {
    /*
        - 在Java项目开发的过程中，一般要用到的算法有两种，排序算法和查找算法
        - 排序算法：冒泡排序、选择排序
        - 查找算法：遍历查找、二分法查找
        - SUM公司已经为Java程序员准备好了封装的数组工具类，程序员调用即可 
        - 算法部分之后在数据结构课上学
     */
    public static void main(String[] args) {
        
        int[] array = {12,15,85,15,31,45,27};
        // 调用排序算法
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // 在排序的基础上使用二分法查找数组中特定值，并返回下标
        int index = Arrays.binarySearch(array, 31);
        System.out.println(index);
    }
}
