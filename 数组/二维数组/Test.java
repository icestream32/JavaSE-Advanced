package 数组.二维数组;
//二维数组的基本使用
public class Test {
    /*
        - 二维数组可以理解为一维数组的集合
        - 基本语法：
            构建静态数组：
                【数据类型】[][] 【变量名】 = {
                    {},
                    {},
                    {}
                } 
                该数组表示长度为3的二维数组
            构建动态数组：
                【数据类型】[][] 【变量名】 = new 【数据类型】[一维数组的个数][每个一维数组中的元素个数]
     */
    public static void main(String[] args) {
        
        //构建静态数组
        int[][] a = {
            {1,45,15,15},
            {15,163,45},
            {15,31},
            {15,1,2,3,4}
        };
        // 数组遍历打印输出
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            // 换行
            System.out.println();
        }

        //构建动态数组
        // 构建一个三行四列的二维数组
        int[][] b = new int[3][4];
        // 数组遍历打印输出
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + " ");
            }
            // 换行
            System.out.println();
        }

    }

}
