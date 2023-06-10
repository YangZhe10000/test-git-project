package JavaCollection;

import java.util.*;

/*
* java.util.Collection 集合接口
* java.util.Collections 集合工具类,方便集合的操作
* */
public class CollectionsTest01 {
    public static void main(String[] args) {
        //ArrayList集合不是线程安全的
        List<String> list=new ArrayList<>();
        //变成线程安全的
        Collections.synchronizedList(list);
        //排序
        list.add("abc");
        list.add("aba");
        list.add("abd");
        list.add("abz");

        Collections.sort(list);
        for(String s:list){
            System.out.println(s);
        }

        List<Wugui2> wuguis=new ArrayList<>();
        wuguis.add(new Wugui2(2000));
        wuguis.add(new Wugui2(2003));
        wuguis.add(new Wugui2(2001));
        wuguis.add(new Wugui2(20011));
        Collections.sort(wuguis);//使用Collections工具类进行排序的自定义类
                                //必须实现Comparable接口

        for(Wugui2 wugui2:wuguis){
            System.out.println(wugui2);
        }

        //对Set集合进行排序
        Set<String> set=new HashSet<>();
        set.add("king");
        set.add("kingsoft");
        set.add("king2");
        set.add("king1");
        //Collections.sort(set); 错误sort方法里必须是一个List
        List<String> mylist=new ArrayList<>(set);
        //经过强制转换后 可以排序
        Collections.sort(mylist);
        for(String s:mylist){
            System.out.println(s);
        }
    }
}
class Wugui2 implements Comparable<Wugui2> {
    int age;

    public Wugui2(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "乌龟{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Wugui2 o) {
        return this.age-o.age;
    }
}
