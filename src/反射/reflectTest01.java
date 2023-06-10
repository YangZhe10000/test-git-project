package 反射;
/*
* 要操作一个类的字节码,首先要获取到这个类的字节码,怎么获取java.lang.Class实例
* 三种方式
* 第一种:Class.forName();
* 第二种:getClass()方法
* 第三种: java语言中任何一种类型,包括基本数据类型 它都有.class属性
*
* */
public class reflectTest01 {
    Class c1;
     /*
     *
     * Class.forName()
     * 1.静态方法
     * 2.方法的参数是一个字符串
     * 3.字符串需要的是一个完整类名。
     * 4.完整类名必须带有包名。java.lang包也不能省略
     *
     * */
    {
        try {
            c1 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*
    * java中任何一个对象都有一个方法:getClass()
    * */
    String s="abc";
    Class c2=s.getClass();//c2代表String.class字节码文件

    //第三种方式
    Class c3=String.class;

}
