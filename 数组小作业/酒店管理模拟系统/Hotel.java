package 数组小作业.酒店管理模拟系统;

public class Hotel {
    // 酒店功能的实现
    // 酒店可以当成一个二维数组，初始化房间对象
    Room[][] rooms;

    public Hotel() {
        // 动态初始化房间对象
        // 此时房间还没建立，需要for嵌套建立
        rooms = new Room[3][10];
        // 通过遍历二维数组建立房间对象
        for (int i = 0; i < rooms.length; i++) 
            for (int j = 0; j < rooms[i].length; j++){
                if (i == 0) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", true);
                } else if (i == 1) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "标准间", true);
                } else if (i == 2) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "总统套房", true);
                }
            }
    }

    //在酒店中打印所有房间信息
    public void print(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++){
                System.out.print(rooms[i][j] + " ");
            }
            //换行
            System.out.println();
        }
    }
    // 在酒店中打印特定房间信息（方法重写）
    public void print(int roomId){

        // 通过房间编号演算出下标，获得房间在二维数组中的位置
        int i = roomId/100 - 1;
        int j = roomId%100 - 1;
        System.out.println(rooms[i][j]);

    }

    //在酒店中实现订房操作
    public void bookRoom(int roomId){

        // 通过房间编号演算出下标，获得房间在二维数组中的位置
        int i = roomId/100 - 1;
        int j = roomId%100 - 1;
        // 判断房间状态
        if (rooms[i][j].isRoomCondition()) {
            rooms[i][j].setRoomCondition(false);
            System.out.println("订房成功！");
            return;
        } else {
            System.out.println("该房间已被占用，请选择其他房间");
            return;
        }

    }

    // 在酒店中实现退房操作
    public void checkOutRoom(int roomId){

        // 通过房间编号演算出下标，获得房间在二维数组中的位置
        int i = roomId/100 - 1;
        int j = roomId%100 - 1;

        // 判断房间状态
        if (!rooms[i][j].isRoomCondition()) {
            rooms[i][j].setRoomCondition(true);
            System.out.println("退房成功！");
            return;
        } else {
            System.out.println("该房间已经是空闲房间！");
            return;
        }
    }

}
