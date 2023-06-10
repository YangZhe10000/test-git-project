package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class IoPropertiesTest01 {
    public static void main(String[] args) {
        /*
        * Properties是一个Map集合,key和value都是String类型
        * 想将userinfo文件中的数据加载到Properties对象当中
        *
        *
        * */
        //新建一个输入流对象
        try {
            FileReader reader=new FileReader("userinfo");
            //新建一个Map集合
            Properties pro=new Properties();

            //调用Properties对象的load方法将文件中的数据加载到Map集合中
            pro.load(reader);//文件中的数据顺着管道 加载到Map集合中
            //其中等号左边为key  等号右边为value

            //通过Key来获取value呢
            String username=pro.getProperty("username");
            System.out.println(username);
            String password=pro.getProperty("password");
            System.out.println(password);
            //以后经常改变的数据,可以单独写到一个文件中 使用程序动态读取


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
