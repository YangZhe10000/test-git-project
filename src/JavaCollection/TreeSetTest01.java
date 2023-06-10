package JavaCollection;

import java.util.TreeSet;

/*
* 1.TreeSet集合底层实际上是一个TreeMap
* 2.TreeMap集合底层是一个二叉树
* 3.放到TreeSet集合中的元素,等同于放到TreeMap集合Key部分了
* 4.TreeSet集合中的元素:无序不可重复,但是可以按照元素的大小自动排序。称为可排序集合
*
*  对于自定义的类型来说,TreeSet可以排序吗?
*  一下程序对Person类型来说 无法排序。因为没有指定Person对象之间的比较规则。
*
*  在没有重写比较器之前如果放入TreeSet 就会出现异常
*  JavaCollection.Person cannot be cast to java.lang.Comparable
*  出现这个异常的原因是:
*  Person类没有实现java.lang.Comparable接口。
* */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Person p1=new Person(32);
        Person p2=new Person(20);
        Person p3=new Person(30);
        Person p4=new Person(25);

        TreeSet<Person> persons=new TreeSet<>();
        persons.add(p1);
        persons.add(p2);//出错了
    }
}
class  Person{
    int age;

    public Person(int age) {
        this.age = age;
    }
}