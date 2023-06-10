package 反射;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest03 {
    public static void main(String[] args) {
        try {
            //通过IO流读取classinfo.properties文件
            FileReader reader =new FileReader("classinfo.properties");
            //创建属性类对象Map
            Properties pro=new Properties();
            //加载
            pro.load(reader);
            //关闭流
            reader.close();
            //通过key获取value
            String ClassName=pro.getProperty("className");
            System.out.println(ClassName);
            //通过反射机制实例化对象
            Class c=Class.forName(ClassName);
            Object o=c.newInstance();
            System.out.println(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
