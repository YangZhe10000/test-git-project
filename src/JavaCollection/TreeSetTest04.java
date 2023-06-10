package JavaCollection;

import java.util.Comparator;
import java.util.TreeSet;
/*
* TreeSet集合中元素可排序的第二种方式:使用比较器的方式
*最终结论:
* 放到TreeSet或者TreeMap集合key部分的元素要想做到排序,包括两种方式:
* 第一种:放在集合中的元素实现java.lang.Comparable接口
* 第二种:在构造TreeSet或者TreeMap集合的时候给他传一个比较器对象
*  Comparable合Comparator怎么选择呢?
*  当比较规则不会发生改变的时候,或者说当比较规则只有一个的时候,建议使用Comparable接口
*  如果比较规则有多个,并且需要多个比较规则之间频繁切换,建议使用Comparator接口
*
* */
public class TreeSetTest04 {
    public static void main(String[] args) {
        //创建TreeSet的时候 使用你自己写的比较器
        //TreeSet<Wugui> wuguis=new TreeSet<>();
        //这样是不行的 因为没有传递比较器进去
        TreeSet<Wugui> wuguis=new TreeSet<>(new WuGuiComparator());
        wuguis.add(new Wugui(1000));
        wuguis.add(new Wugui(800));
        wuguis.add(new Wugui(810));

        for(Wugui wugui:wuguis){
            System.out.println(wugui);
        }

    }
}
//乌龟
class Wugui {
    int age;

    public Wugui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "乌龟{" +
                "age=" + age +
                '}';
    }
}
//单独在这里编写一个比较器
//比较器实现java.util.Comparator接口(Comparable是java.lang包下的)
//Comparator是java.util包下的
class WuGuiComparator implements Comparator<Wugui>{

    @Override
    public int compare(Wugui o1, Wugui o2) {
        //指定比较规则
        return o1.age-o2.age;
    }
}