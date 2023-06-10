package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 用FileInputStream和FileOutputStream完成对文件的拷贝
* 拷贝的过程应该时一边读,一边写
* 使用以上的字节流拷贝文件的适合,文件的类型随意。
*
*
* */
public class CopyFileTest01 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            //创建一个输入流对象
            fis=new FileInputStream("D:\\年兽活动.jpg");
            //创建一个输出流对象
            fos=new FileOutputStream("E:\\年兽活动.jpg");

            //最核心的 一边读 一边写
            byte[] bytes=new byte[100*1024];//100kb(一次拷贝100kb)
            int readCount=0;
            while ((readCount=fis.read(bytes))!=-1){
                fos.write(bytes,0,readCount);
            }

            //刷新 输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
