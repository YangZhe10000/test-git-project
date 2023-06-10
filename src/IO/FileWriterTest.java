package IO;

import java.io.FileWriter;
import java.io.IOException;

/*
* 文件字符输出流
* 只支持普通文本
* */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter writer=null;
        try {
            //没有会自动创建文件
            writer=new FileWriter("file");
            //开始写
            char[] chars={'我','是','中','国','人'};
            writer.write(chars);
            writer.write(chars,0,2);
            writer.write("我是一个wrong door 人");
            //刷新
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
