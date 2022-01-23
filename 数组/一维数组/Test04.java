package 数组.一维数组;
//用于测试数组拷贝的使用
public class Test04 {
    
    /*
        - 实际开发中我们实现定义的数组长度可能不够用，这时候需要用到数组扩容
        - 可以通过将原本的数组拷贝到另一个更长的数组中，但是这样是效率比较低
        - 因此，Java类库中的System类提供了一个arraycopy方法，用于数组拷贝，同时也可以用于数组扩容 
        - 语法：System.arraycopy(被拷贝数组名, 被拷贝数组拷贝起点（下标）, 拷贝数组名, 拷贝数组拷贝起点, 拷贝长度（一般为被拷贝数组原长）);
     */
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4};
        int[] b = new int[20];
        //数组拷贝
        System.arraycopy(a, 0, b, 0, a.length);
        //数组遍历
        for (int i = 0; i <= a.length; i++) {
            System.out.println("数组下标为" + i + "的值为" + b[i]);
        }
    }
}
