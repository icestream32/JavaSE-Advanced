package 数组小作业.酒店管理模拟系统;

import java.util.*;

//新建一个类，用来模拟酒店中各个小房间
public class Room {

    // 房间房号
    private int roomId;

    // 房间类型
    private String roomType;

    // 房间状态，真为空闲，假为客人居住
    private boolean roomCondition = true;

    // 构造函数,设定房间参数
    public Room(int roomId, String roomType) {
        this.roomId = roomId;
        this.roomType = roomType;
    }

    // 订房操作
    public void bookRoom() {
        if (!roomCondition) {
            System.out.println("该间已经有客人居住，请更换房间！");
        } else {
            // 客人入住，房间状态变为客人居住状态
            roomCondition = false;
            System.out.println("订房成功!");
        }
    }

    // 退房操作
    public void checkOutRoom() {

        roomCondition = true;
        System.out.println("退房成功！");

    }

    // 打印房间信息
    public void printRoom() {

        System.out.print("房间号：" + roomId + " 房间类型:" + roomType);
        if (roomCondition) {
            System.out.println(" 房间状态：空闲");
        } else {
            System.out.println(" 房间状态：客人居住");
        }

    }

}

class Test {

    public static void main(String[] args) {

        // 初始化酒店房间参数
        Room room101 = new Room(101, "单人房");
        Room room102 = new Room(102, "单人房");
        Room room103 = new Room(103, "单人房");
        Room room104 = new Room(104, "单人房");
        Room room105 = new Room(105, "单人房");
        Room room201 = new Room(201, "标准房");
        Room room202 = new Room(202, "标准房");
        Room room203 = new Room(203, "标准房");
        Room room204 = new Room(204, "标准房");
        Room room205 = new Room(205, "标准房");
        Room room301 = new Room(301, "豪华房");
        Room room302 = new Room(302, "豪华房");
        Room room303 = new Room(303, "豪华房");
        Room room304 = new Room(304, "豪华房");
        Room room305 = new Room(305, "豪华房");

        // 将房间信息放入二维数组，并提供一个查询二维数组
        Room[][] rooms = {
                { room101, room102, room103, room104, room105 },
                { room201, room202, room203, room204, room205 },
                { room301, room302, room303, room304, room305 }
        };
        int[][] roomNum = {
                { 101, 102, 103, 104, 105 },
                { 201, 202, 203, 204, 205 },
                { 301, 302, 303, 304, 305 }
        };

        // 用户认证
        System.out.print("请输入用户名与密码：");
        try (Scanner s = new Scanner(System.in)) {
            String userName = s.next();
            String userPassword = s.next();
            if ("admin".equals(userName) && "123".equals(userPassword)) {
                System.out.println("登陆成功，欢迎登陆酒店管理系统！");
            } else {
                System.out.println("登陆失败，用户名不存在或密码错误！");
                return;
            }

            // 令程序一直处于待机状态
            while (true) {
                System.out.println("请输入需要执行的操作。例如：订房、退房、查看房间信息");
                String information = s.next();

                // 订房操作
                if ("订房".equals(information)) {
                    System.out.print("请输入房间号：");
                    int roomNumber = s.nextInt();
                    for (int i = 0; i < roomNum.length; i++) {
                        for (int j = 0; j < roomNum[i].length; j++) {
                            if (roomNumber == roomNum[i][j]) {
                                rooms[i][j].bookRoom();
                                break;
                            }
                        }
                    }
                }

                // 退房操作
                if ("退房".equals(information)) {
                    System.out.print("请输入房间号：");
                    int roomNumber = s.nextInt();
                    for (int i = 0; i < roomNum.length; i++) {
                        for (int j = 0; j < roomNum[i].length; j++) {
                            if (roomNumber == roomNum[i][j]) {
                                rooms[i][j].checkOutRoom();
                                break;
                            }
                        }
                    }
                }

                // 打印房间信息
                if ("查看房间信息".equals(information)) {
                    System.out.print("请输入预定的房间号：");
                    int roomNumber = s.nextInt();
                    for (int i = 0; i < roomNum.length; i++) {
                        for (int j = 0; j < roomNum[i].length; j++) {
                            if (roomNumber == roomNum[i][j]) {
                                rooms[i][j].printRoom();
                                break;
                            }
                        }
                    }
                }
            }

        }
    }

}