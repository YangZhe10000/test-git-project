package IO;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        try {
            //BufferedWriter out=new BufferedWriter(new FileWriter("nmsl"));
            BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("nmsl")));
            out.write("helloWorld");
            out.write("\n");
            out.write("sxc");
            //刷新
            out.flush();
            //关闭
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
