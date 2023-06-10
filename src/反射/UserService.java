package 反射;

public class UserService {
    int no;
    int age;
    public  boolean login(String name,String password){
        if(name.equals("admin")&&password.equals("123")){
            return true;
        }
        return false;
    }
    public void logout(){
        System.out.println("系统已经安全退出");
    }
}
