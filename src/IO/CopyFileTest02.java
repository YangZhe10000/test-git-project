package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
* 使用FileReader和FileWriter进行拷贝 只能拷贝文本
*  普通文本文件不止是txt 任何可以被记事本打开的文件都可以称作普通文本
*
* */
public class CopyFileTest02 {
    public static void main(String[] args) {
        FileReader reader=null;
        FileWriter writer=null;
        try {
            reader=new FileReader("gkd");
            writer=new FileWriter("nmsl");
            char[] chars=new char[4];
            int readCount=0;
            while ((readCount=reader.read(chars))!=-1){
                writer.write(chars,0,readCount);
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
