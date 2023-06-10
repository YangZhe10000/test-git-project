package 反射;
/*
* 研究一下Class.forName()发生了什么？
* 如果只是希望一个类的静态代码块执行,其他代码不执行 你可以使用
* Class.forName("完整类名");
* 这个方法的执行会导致类加载,类加载,静态代码执行
* */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            Class.forName("反射.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class MyClass{
    //静态代码块在类加载时执行,并且只执行一次
    static {
        System.out.println("MyClass的静态代码块执行了");
    }
}