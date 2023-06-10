package IO;

import javax.swing.text.Style;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
*  序列化:Serialize java对象存储到文件中,将java对象的状态保存下来的过程
*  反序列化:DeSerialize 将硬盘上的数据重新恢复到内存当中,恢复成java对象
*
* 序列化对应: ObjectOutputStream
* 反序列化对应:ObjectInputStream
*
*  自定义接口Student没有实现Serializeable接口 不能序列化
*  而参与序列化和反序列化的对象 必须实现这个接口
*
*  注意:通过源代码发现Serializeable接口只是一个标志接口 里面没有任何代码
*
*  只是起到一个标志的作用 给java虚拟机看的 java虚拟机看到这个接口之后会为该类
*  自动生成一个序列化版本号
*
* 序列化版本号有什么用呢
* 更新了student源代码之后 再次反序列化出现了如下异常
* java.io.InvalidClassException: IO.Student; local class incompatible:
* stream classdesc serialVersionUID = -5056639768775084458,
* local class serialVersionUID = -8803925773803445258
*
* java语言中是采用什么机制来区分类的?
* 第一:首先通过类名进行比对,如果类名不一样,肯定不是同一个类
* 第二:如果类名一样,靠序列化版本号进行区分
*
* 假如两个人都编写了同一个类名的类 比如说IDEA——work/IO/Student
*  但这两个确实不是同一个"类" 这个时候序列化版本号就起了作用
*  对于java虚拟机来说 只要这两个类都实现了 Serializeable序列化接口
*   那他们的序列化版本号就会不一样 就能够区分这两个类
*
*   这种自动生成的序列号有缺陷
*   一旦代码确定之后,不能进行后续的修改
*   因为只要修改,必然会重新编译,此时会生成新的序列化版本号,这个时候Java虚拟机会
*   认为这是一个全新的类。
*
*   凡是一个类 实现了Serializeable 应该给这个类一个固定不变的版本序列号
*   这样以后这个类即使代码修改了,但是版本号不变,java虚拟机会认为这是同一个类
*
*   使用以下代码手动生成序列号
*   private static final long serialVersionUID = 866565362666446189L;
* */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) {
        //创建java对象
       Student s=new Student(1111,"zhangsan");
        try {
            //序列化
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("students"));
            oos.writeObject(s);
            //刷新
            oos.flush();
            //关闭
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
