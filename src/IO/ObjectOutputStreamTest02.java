package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
*
* 一次序列化多个对象
*   可以将对象放到集合中 序列化集合
* */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) {
            List<Student> studentList=new ArrayList<>();
            studentList.add(new Student(1111,"zhangsan"));
            studentList.add(new Student(2222,"lisi"));
            studentList.add(new Student(3333,"wangwu"));
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("students2"));
            oos.writeObject(studentList);//写入一个序列化集合
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
