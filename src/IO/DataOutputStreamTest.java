package IO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* java.io,DataOutputStream 数据专属的流
* 这个流可以将数据连同数据类型一并写入文件。
* 注意:这个文件不是普通文本文档。(这个文件使用记事本打不开)
*
*
* */
public class DataOutputStreamTest {
    public static void main(String[] args) {

        try {
            //这个文件一般是打不开的 简单来说就是加密之后的类型
            //需要专门的DataInputStream流才能将其取出
            //创建数据专属的字节输出流 它是一个包装流
            DataOutputStream dos=new DataOutputStream(new FileOutputStream("Data"));
            //写数据
            byte b=100;
            short s=200;
            int i=300;
            long l=400L;
            float f=3.0f;
            double d=3.14;
            boolean sex=false;
            char c='a';
            //写
            dos.writeByte(b);
            dos.writeShort(s);
            dos.writeInt(i);
            dos.writeLong(l);
            dos.writeFloat(f);
            dos.writeDouble(d);
            dos.writeBoolean(sex);
            dos.writeChar(c);
            //刷新
            dos.flush();
            //关闭
            dos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
