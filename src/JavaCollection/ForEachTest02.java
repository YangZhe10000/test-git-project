package JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> strList=new ArrayList<String>();

        //添加元素
        strList.add("nmsl");
        strList.add("sxc");
        strList.add("gz");

        //遍历,使用迭代器方式
        Iterator<String> it=strList.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }

        //使用下标方式(只针对于有下标的集合)
        for(int i=0;i<strList.size();i++){
            System.out.println(strList.get(i));
        }

        //使用foreach
        for(String s:strList){//泛型为String 
            System.out.println(s);
        }

    }
}
