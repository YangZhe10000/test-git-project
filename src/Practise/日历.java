package Practise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class 日历 {
    public static void main(String[] args) {
        String datestr="yyyy年MM月dd日E HH时mm分ss秒";
        SimpleDateFormat datef=new SimpleDateFormat(datestr);
        System.out.println("今天是"+datef.format(new Date()));
        long now=System.currentTimeMillis();
        datef=new SimpleDateFormat("yyyy年MM月dd日E");
        System.out.println(", 明天是"+datef.format(new Date(now+24*60*60*1000)));
        日历.print(new GregorianCalendar());
    }
    public static void print(Calendar calendar){
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH)+1;
        calendar.set(year,month-1,1);
        int week=calendar.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println(year+"年"+month+"月的日历\n 日 一 二 三 四 五 六");
        if(week>0)
            System.out.println(String.format("%"+4*week+"c",' '));
        System.out.println(year);
    }
}
