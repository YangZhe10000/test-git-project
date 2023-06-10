package JavaCollection;

import java.util.Properties;

/*
* 目前只需要掌握Properties属性类对象的相关方法即可
* Properties是一个Map集合,继承Hashtable,Properties的Key和value都是
* String类型
*
*
* */
public class PropertiesTest {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties properties=new Properties();
        //需要掌握Properties两个方法 一个存一个取
        properties.setProperty("username","root");
        properties.setProperty("password","123456");
        System.out.println(properties.getProperty("username"));
    }
}
