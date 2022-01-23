package 常用类.Interface接口;
//接口在实际开发中的应用
public class InterfaceTest03 {
    public static void main(String[] args) {
        
        //创建厨师对象
        FoodMenu cook1 = new ChinaCook();
        //FoodMenu cook2 = new AmericaCook();
        //创建顾客对象
        //顾客可以随意选择厨师炒菜
        Customer customer = new Customer(cook1);
        //Customer customer = new Customer(cook2);
        //顾客点菜
        customer.order();

    }
}
