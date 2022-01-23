package 常用类.Interface接口;
//接口的调用
//顾客点菜
public class Customer {

    //顾客手里有一个菜单
    //Customer has a Menu! 凡是能够使用has a来描述的，统一以属性凡是存在
    //实例变量，属性
    FoodMenu foodMenu;

    //构造函数
    public Customer(){

    }
    public Customer(FoodMenu foodMenu){
        this.foodMenu = foodMenu;
    }

    //setter and getter
    public FoodMenu getFoodMenu() {
        return foodMenu;
    }
    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //提供点菜窗口
    public void order(){

        foodMenu.shiZiChaoJiDan();
        foodMenu.yuXiangRouSi();

    }

}

/*
    Cat is a Animal! 凡是满足is a来描述的都可以用来继承
    Customer has a Menu! 凡是能够使用has a来描述的，统一以属性凡是存在
*/