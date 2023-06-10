package 反射;

public class ReflectTest02 {
    public static void main(String[] args) {
        //通过反射机制 获取Class 通过Class实例化对象
        Class c;
        try {
            c=Class.forName("IO.Student");
            //实例化
            //new Instance会调用无参构造函数 所以必须有无参构造函数才能实例化
            Object o=c.newInstance();
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
}
