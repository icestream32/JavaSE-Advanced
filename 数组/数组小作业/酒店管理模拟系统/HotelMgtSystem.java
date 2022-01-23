package 数组.数组小作业.酒店管理模拟系统;

import java.util.Scanner;

//前台管理，用来实现题目要求的所有功能
public class HotelMgtSystem {

    /*
    老师讲评后对以下程序进行修改
    - 无论是什么项目，都要有getter、setter方法
    - 无论是什么项目，都要重写toString和equals方法，标准由自己来定
    - 房间可以当成一个类，用来创建房间对象
    - 酒店可以当成一个类，用来初始化实现房间对象
    - 酒店管理系统的界面应该写得有模有样
 */
    public static void main(String[] args) {

        System.out.println("欢迎使用酒店管理系统！");
        Hotel hotel = new Hotel();
        try (Scanner s = new Scanner(System.in)) {
            while (true) {
                System.out.println("对应的功能编号：[1]表示查看房间列表[2]表示订房[3]表示退房[0]表示退出系统");
                System.out.print("请输入对应的功能编号:");
                int index = s.nextInt();
                if (index == 0) {
                    System.out.println("感谢您的使用！");
                    return;
                } else if (index == 1) {
                    hotel.print();
                } else if (index == 2) {
                    System.out.print("请输入需要预定的房间号：");
                    hotel.bookRoom(s.nextInt());
                } else if (index == 3) {
                    System.out.println("请输入需要退订的房间号：");
                    hotel.checkOutRoom(s.nextInt());
                }
            }
        }

    }

}
