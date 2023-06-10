package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        System.out.println("hello world!");//输出到控制台

        PrintStream ps=System.out;
        ps.println("hello zhangsan");
        ps.println("hello lisi");
        ps.println("hello wangwu");
        //标准输出流不需要close()关闭。
        //可以改变标准输出流的输出方向? 可以
       /*
        System.gc();
        System.currentTimeMillis();
        PrintStream ps2=System.out;
        System.exit(0);
        System.arraycopy();
        */
        try {
            PrintStream printStream=new PrintStream(new FileOutputStream("nmsl"));
            System.setOut(printStream); //标准输出流不再指向控制台 指向一个 nmsl 文件
            System.out.println("我去你妈的");//改变之后 这会在nmsl文件中输出
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
