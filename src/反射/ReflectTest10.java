package 反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 重点:必须掌握,通过反射机制怎么调用一个对象的方法
*
* */
public class ReflectTest10 {
    public static void main(String[] args) {
        //不使用反射机制
        UserService userService=new UserService();
        boolean loginSuccess=userService.login("admin","123");
        System.out.println(loginSuccess);

        //通过反射机制来调用一个方法
        try {
            Class userServiceClass=Class.forName("反射.UserService");
           Object obj=userServiceClass.newInstance();
           /*
           * 要素分析
           * 要素1:对象userService
           * 要素2:login方法名
           * 要素3:实参列表
           * 要素4:返回值
           *
           *
           *
           * */
           //因为方法可以重载 可能会有同名的方法
            //java中区分方法靠的是参数的个数和类型
            Method loginMethod=userServiceClass.getDeclaredMethod("login", String.class, String.class);
            //调用方法
            //第一个Object 是这个对象 就是实例化出来的对象
            //第二个可变长参数 是实参列表
            //invoke方法返回一个Object
            Object retValue=loginMethod.invoke(obj,"admin","123");
            System.out.println(retValue);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
