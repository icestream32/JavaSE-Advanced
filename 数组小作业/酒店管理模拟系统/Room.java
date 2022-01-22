package 数组小作业.酒店管理模拟系统;

public class Room {

    // 房间房号
    private int roomId;

    // 房间类型
    private String roomType;

    // 房间状态，真为空闲，假为客人居住
    private boolean roomCondition = true;

    // 构造函数,设定房间参数
    public Room(int roomId, String roomType, boolean roomCondition) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomCondition = roomCondition;
    }
    // setter and getter
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    // 注意，布尔类型的变量get方法名称是isXxx()
    public boolean isRoomCondition() {
        return roomCondition;
    }

    public void setRoomCondition(boolean roomCondition) {
        this.roomCondition = roomCondition;
    }
    
    // 重写toString方法
    // 返回房间状态信息，注意System.out.println打印输出的输出规则
    public String toString() {
        return "[房间号："+roomId+", 房间类型："+roomType+", 房间状态："+(roomCondition ? "空闲" : "占用")+"]";
    }

    // 重写equals方法
    // 当房间号相等时，我们可以认为房间相等
    public boolean equals(Object obj) { 
        if (obj == null || !(obj instanceof Room)) return false;
        if (this == obj) return true;

        // 向下类型转换     
        Room room = (Room)obj;
        // 当前对象的房间编号等于传过来的房间编号，认为相等
        return this.roomId == room.getRoomId();
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
    // 测试main方法，之后可以删除
    /* public static void main(String[] args) {

        Room room1 = new Room(101, "豪华房", false);
        Room room2 = new Room(101, "豪华房", false);
        System.out.println(room1);
        System.out.println(room1.equals(room2));

    } */

}
