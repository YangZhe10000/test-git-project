package reflect;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) {
        try {
           // String path=Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
            //以流的方式返回
            InputStream reader=Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo.properties");
            Properties pro=new Properties();
            pro.load(reader);
            reader.close();
            //通过Key获取value
            String className=pro.getProperty("className");
            System.out.println(className);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
