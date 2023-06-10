package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*
* 日志工具
*
* */
public class Logger {
    /*
    *
    * 记录日志的方法
    * */
    public static void log(String msg){
        try {
            PrintStream out=new PrintStream(new FileOutputStream("nmsl",true));
            System.setOut(out);
            Date nowTime=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime=sdf.format(nowTime);
            System.out.println(strTime+": "+msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
