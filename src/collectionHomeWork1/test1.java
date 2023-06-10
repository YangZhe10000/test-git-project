package collectionHomeWork1;

import java.util.ArrayList;
import java.util.Iterator;

public class test1 {
    public static void main(String[] args) {
        News news1=new News("新冠确诊兵力超千万,数百万印度信徒赶赴恒河\"圣浴\"引民众困扰");
        News news2=new News("男子突然想起两个月前钓的鱼还在网兜里,捞起以看赶紧放生");
        ArrayList<News> arrayList=new ArrayList<News>();
        arrayList.add(news1);
        arrayList.add(news2);
        int size=arrayList.size();
        for(int i=size-1;i>=0;i--){
            News temp=arrayList.get(i);
            System.out.println(processTitle(temp.getTitle()));
        }
    }
    public static String processTitle(String title){
        if(title==null) return "";
        if(title.length()>15){
            return title.substring(0,15)+"...";
        }else {
            return title;
        }
    }
}
