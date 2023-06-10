package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* BufferedReader:
*  带有缓冲区的字符输入流
*  使用这个流的时候不需要自定义Byte数组或者char数组 自带缓冲区
* */
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        try {
            //BufferedReader构造方法里需要一个reader
            //但是reader本身是抽象类不能实例化 所以我们用他的子类创建对象
            FileReader reader=new FileReader("nmsl");
            //当一个流的构造方法需要一个流的时候,这个被传进来的流叫做:节点流
            //外部负责包装的这个流,叫做:包装流,还有一个名字叫作:处理流
            //就目前这个程序来说: FileReader就是一个节点流。BufferedReader是一个包装流
            BufferedReader br=new BufferedReader(reader);

            //br.readLine读一行 但是不带换行符
           String s=null;
           while ((s=br.readLine())!=null){
               System.out.println(s);
           }

            //关闭流
            //对于包装流来说,只需要关闭最外层流就行,里面的流会自动关闭
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
