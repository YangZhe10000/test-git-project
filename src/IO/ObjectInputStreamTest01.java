package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
*
* 反序列化
*
*
*
* */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("students"));
            //开始反序列化 读
            Object obj=ois.readObject();
            System.out.println(obj);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
