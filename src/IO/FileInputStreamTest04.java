package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
*最终版 需要掌握
*
* */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int readCount=0;
        try {
            fis=new FileInputStream("test.txt");
            byte[] bytes=new byte[6];
           /* while(true){
                 readCount=fis.read(bytes);
                if(readCount==-1){
                    break;
                }
                System.out.print(new String(bytes,0,readCount));
            }*/
            //改进
            while((readCount=fis.read(bytes))!=-1){
                System.out.print(new String(bytes,0,readCount));
            }
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
