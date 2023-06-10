package IO;

import java.io.*;

public class BufferedReaderTest02 {
    public static void main(String[] args) {
        try {
            /*FileInputStream fis=new FileInputStream("gkd");
            //通关转换流将字节流转换成字符流
            InputStreamReader reader=new InputStreamReader(fis);
            //这个构造方法只能传字符流不能传字节流
            BufferedReader br=new BufferedReader(reader);*/

            //合并写法
            BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("gkd")));

            String line=null;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
            //关闭只需要关闭最外层
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
