package IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File f1=new File("nmsl");
        System.out.println("获取文件名: "+f1.getName());//获取文件名

        //判断是否是一个文件
        System.out.println(f1.isFile());
        //判断是否为一个目录
        System.out.println(f1.isDirectory());
        //获取最后一次文件的修改时间
        long haoMiao=f1.lastModified();
        Date time=new Date(haoMiao);//转换成日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime=sdf.format(time);
        System.out.println(strTime);

        //获取文件大小
        System.out.println(f1.length());

    }
}
