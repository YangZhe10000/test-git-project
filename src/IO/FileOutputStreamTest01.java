package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            //这种方式会把原文件清空 然后再写入 谨慎使用
            //fos=new FileOutputStream("gkd");
             //在后面加个true 表示在原文件末尾处追加内容 不会覆盖原文件
            fos=new FileOutputStream("gkd",true);
            //开始写
           byte[] bytes={98,99,100};
           //将byte数组全部写入 当名字为gkd的文件不存在时 会自动新建
           fos.write(bytes);
           fos.write(bytes,0,2);
          //将字符串写入文件
           String s="哼,想逃? 闪电旋风劈!";
           //将字符串转换成数组
           byte[] bytes1=s.getBytes();
           fos.write(bytes1);
            //写完之后 最后一定要刷新
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
