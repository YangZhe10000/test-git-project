package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/*
* 反序列化集合
*
* 另外 transient 关键字表示游离的 不参与序列化
*   String transient name  在序列化后读出来 Name那儿为Null
*
*
*
* */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("students2"));
            //Object object=ois.readObject();
            List<Student> studentList=(List<Student>) ois.readObject();
            for(Student student:studentList){
                System.out.println(student);
            }
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
