package JavaCollection;

import java.util.*;

public class 知识点 {
    public static void main(String[] args) {
        /*
          集合这块需要掌握的内容
        * 1.1每个集合对象的创建
        * 1.2向集合中添加元素
        * 1.3从集合中取出元素
        * 1.4遍历集合
        * 1.5主要的集合类: ArrayList LinkList HashSet
        *  TreeSet HashMap Properties TreeMap
        *
        *  HashMap的Key 存储在HashMap集合key的元素需要同时重写hashCode+equals
        *
        *
        *
        * */
        //ArrayList复习
        ArrayList<String> list=new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        //取出第一个
        String firstElt=list.get(0);
        System.out.println(firstElt);
        //三种遍历
        //for循环
        for(int i=0;i<list.size();i++){
            String elt=list.get(i);
            System.out.println(elt);
        }
        //foreach遍历
        for(String s:list){
            System.out.println(s);
        }
        //迭代器遍历
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String elt=it.next();
            System.out.println(elt);
        }
        //LinkList只需要改变类型

        System.out.println("-----------------------");
        System.out.println("以下是HashSet练习");
        HashSet<String> set=new HashSet<>();
        set.add("abc");
        set.add("sxc");
        set.add("dsm");
        set.add("1");
        set.add("2");
        set.add("4");
        set.add("5");
        //set集合没有下标 所以取不出来 只能遍历
        //遍历集合
        Iterator it1=set.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        //foreach
        for(String s:set){
            System.out.println(s);
        }
        //创建Set集合,存储Student数据
        Set<Student1> students=new HashSet<>();
        Student1 s1=new Student1(20,"zhangsan");
        Student1 s2=new Student1(21,"lisi");
        Student1 s3=new Student1(22,"wangwu");
        Student1 s4=new Student1(20,"zhangsan");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students.size());
        //遍历
        for(Student1 student1:students){
            System.out.println(student1);
        }

        //TreeSet练习
        //TreeSet的Integer和String类型的排序规则是规定好的
        System.out.println("-----------------------");
        System.out.println("以下是TreeSet练习");
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(10);
        ts.add(1000);
        ts.add(100);
        for(Integer i:ts){
            System.out.println(i);
        }
        //HashMap练习
        System.out.println("-----------------------");
        System.out.println("以下是HashMap练习");
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(10,"wangwu");
        map.put(9,"sxc");
        System.out.println(map.get(2));
        //遍历Map集合很重要,几种方式都要会
        //第一种方式:先获取所有的Key,遍历Key的时候,通过Key获取value
        Set<Integer> keys=map.keySet();
        for(Integer i:keys){
            System.out.println("key的值是: "+i+" "+"value的值是: "+map.get(i));
        }
        Set<Map.Entry<Integer,String>> set2=map.entrySet();
        for(Map.Entry<Integer,String> value:set2){
            System.out.println("key的值是: "+value.getKey()+" "+"value的值是: "+value.getValue());
        }



    }

}
class Student1{
     int no;
     String name;

    public Student1() {
    }

    public Student1(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return no == student1.no &&
                Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
