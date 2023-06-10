package 反射;
/*
* 重点:给你一个类,怎么获取这个类的父类,已经实现了那些接口
*
* */
public class ReflectTest13 {
    public static void main(String[] args) {
        //String举例
        try {
            Class c=Class.forName("java.lang.String");
            //获取String的父类
           Class superClass=c.getSuperclass();
            System.out.println(superClass);
            //获取String类实现的多个接口
            Class[] interfaces=c.getInterfaces();
            for(Class interfaceClass:interfaces){
                System.out.println(interfaceClass);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
