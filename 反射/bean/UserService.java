package 反射.bean;

public class UserService {
    
    // 登录系统
    public boolean login(String userName,String password) {
        if ("admin".equals(userName) && "123".equals(password)) {
            return true;
        }
        return false;
    }

    // 退出系统
    public void logout() {
        System.out.println("系统已经安全退出！");
    }

}
