package JavaCollection;

import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        Customer c1=new Customer(32);
        Customer c2=new Customer(20);
        Customer c3=new Customer(30);
        Customer c4=new Customer(25);

        TreeSet<Customer> customers=new TreeSet<>();
        customers.add(c1);
        customers.add(c2);//出错了
        customers.add(c3);//恢复正常
        customers.add(c4);

        //遍历
        for(Customer c:customers){
            System.out.println(c);
        }
    }
}
//放在TreeSet集合中的元素需要实现java.lang.Comparable接口
//并实现compareTo方法。equals可以不写
class Customer implements Comparable<Customer>{
    int age;

    public Customer(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                '}';
    }
    //需要在这个方法中编写比较的逻辑或者规则,按照什么进行比较
    //k.compareTo(t.key)
    //拿着参数k和集合中的每一个k进行比较,返回值可能是>0 <0 =0
    @Override
    public int compareTo(Customer c) {
       //this是c1
        // c是c2
        // c1和c2比较的时候,就是this和c比较
        int age1=this.age;
        int age2=c.age;
        /*if(age1==age2){
            return 0;
        }
        else if(age1>age2){
            return 1;
        }
        else if(age1<age2){
            return -1;
        }*/
        return age1-age2;//包含了三种情况
    }
}
