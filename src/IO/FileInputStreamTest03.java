package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
* int read(byte[] b)
*    一次最多读取b.length个字节
*     减少内存和硬盘的交互,提高程序的执行效率。
*     往byte[]数组当中读。
*
*
* */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //相对路径的话呢?相对路径一定是当前所在的位置作为起点开始找!
            //IDEA默认的当前路径是工程的根目录
            //  fis=new FileInputStream("chapter23/test.txt");
            //  fis=new FileInputStream("chapter23/src/test.txt");
            fis=new FileInputStream("test.txt");
            byte[] bytes=new byte[6];//准备一个长度为4的byte数组
            int readCount=fis.read(bytes);//现在返回的是读到的字节的数量
            System.out.println(readCount);
            System.out.println(new String(bytes));//将byte数组的数据转换成字符串
            readCount=fis.read(bytes);
            System.out.println(readCount);
            System.out.println(new String(bytes));
            //不应该全部都转换 应该是读取了多少个字节转换多少个字节
            //不然会出现读的数据不足数组的长度 出现了覆盖了前面的数据 然而数组的剩余部分还是老
            //数据的情况
            readCount=fis.read(bytes);
            System.out.println(readCount);
            System.out.println(new String(bytes,0,readCount));

            readCount=fis.read(bytes);
            System.out.println(readCount);
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
