package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
     D:\study\test.txt

*    FileInputStream:
*    1.文件字节输入流,万能的,任何类型的文件都可以采用这个流来读
*    2.字节的方式,完成输入的操作,完成读操作(从硬盘到内存)
*
*
*
* */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
         //创建文件字节输入流对象
        FileInputStream fis=null;
        try {
            //这里的双斜杠有一个是转译字符
             fis=new FileInputStream("D:\\study\\test.txt");
            // 一个 /也可以是可以的
            //FileInputStream fis=new FileInputStream("D:/study/test");

            //开始读
            int readData=fis.read();
            System.out.println(readData);

            readData=fis.read();
            System.out.println(readData);

            readData=fis.read();
            System.out.println(readData);

            readData=fis.read();
            System.out.println(readData);

            readData=fis.read();
            System.out.println(readData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //在finally语句中保证流一定要关闭
            //关闭流的前提是:流不是空。流是Null的时候没有必要关
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
