package IO;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 866565362666446189L;
    private int no;
    private String name;
    //过了很久 Student这个类源代码改动了
    //源代码改动后,需要重新编译,编译之后生成了全新的字节码文件。
    //并且class文件再次运行的时候,java虚拟机生成的序列化版本号也会产生相应的改变
    private  int age;
    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
