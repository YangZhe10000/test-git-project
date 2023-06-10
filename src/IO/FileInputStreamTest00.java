package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
*int available() 返回剩余可读的字节数
* Long skip(long n)跳过多少个字节
*
* */
public class FileInputStreamTest00 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int readCount=0;
        try {
            fis=new FileInputStream("test.txt");
            System.out.println("一共有多少个字符可以读取: "+fis.available());
            byte[] bytes=new byte[fis.available()];
            //available方法可以用来设置Byte数组的长度以完成一次性读完
            //这个方法不适合大文件,因为Byte数组不能太大
            fis.skip(6);
            readCount=fis.read(bytes);
            System.out.println(new String(bytes,0,readCount));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
