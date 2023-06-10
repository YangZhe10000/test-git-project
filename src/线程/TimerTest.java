package 线程;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        Timer timer=new Timer();
        Date firstTime=null;
        //Timer timer=new Timer(true); 守护线程
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            firstTime=sdf.parse("2022-02-07 22:32:00");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        timer.schedule(new LogTimerTask(), firstTime, 1000 * 10);
    }
}
//编写一个定时任务类
class  LogTimerTask extends TimerTask{

    @Override
    public void run() {
        //编写你需要执行的任务
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime=sdf.format(new Date());
        System.out.println(strTime+" 完成了一次数据备份");
    }
}
