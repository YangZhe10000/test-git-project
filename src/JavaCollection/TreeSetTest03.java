package JavaCollection;

import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        TreeSet<Vip> vips=new TreeSet<>();
        vips.add(new Vip("zhangsan",20));
        vips.add(new Vip("zhangsi",20));
        vips.add(new Vip("lisi",18));
        vips.add(new Vip("liwu",18));

        for(Vip vip:vips){
            System.out.println(vip);
        }
    }
}
/*
* compareTo方法的返回值很重要:
* 返回0表示相同 value会覆盖
* 返回<0 会在左子树上继续找
* 返回>0 会在右子树上继续找
*
*
* */
class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Vip v) {
        if(this.age==v.age){
            return this.name.compareTo(v.name);
        }
        return this.age-v.age;
    }
}