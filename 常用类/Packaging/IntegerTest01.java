package 常用类.Packaging;
//用于测试八种包装类的使用
public class IntegerTest01 {
    /*
        - 实际开发中有这样的需求：有一个doSome方法默认传入的是引用类型，
            但有时我们需要传入一个int数据类型的值进去，这时候需要用到包装类。

        - SUM公司为程序员准备了八大基本数据类型对应的八大包装类，分别是
            基本数据类型                包装数据类型
            ----------------------------------------
            byte                        java.lang.Byte(父类Number)
            short                       java.lang.Short(父类Number)
            int                         java.lang.Integer(父类Number)
            long                        java.lang.Long(父类Number)
            float                       java.lang.Float(父类Number)
            double                      java.lang.Double(父类Number)
            boolean                     java.lang.Boolean(父类Object)
            char                        java.lang.Character(父类Object)

        - 以上八种包装类中，重点以java.lang.Integer为代表进行学习，其他的照葫芦画瓢就行。

        - 八种包装类中其中6个都是数字对应的包装类，他们的父类都是Number，可以研究父类Number中对应的公共方法。
     */
    public static void main(String[] args) {
        
        /* // 将基本数据类型转换成引用数据类型（装箱）
        Integer i = new Integer(12);

        // 将引用数据类型转换成基本数据类型（拆箱）
        float floatValue = i.floatValue();
        System.out.println(floatValue); */

        // 在JDK1.5之后，已经支持自动装箱和自动拆箱
        /*
            自动装箱：将基本数据类型自动转换成引用数据类型
            自动拆箱：将引用数据类型自动转换成基本数据类型
            因此上面那种方式才会被淘汰
         */
        Integer x = 100;
        // 自动转换机制
        System.out.println(x + 1);
        
        float y = x;
        System.out.println(y);

    }
    
}
