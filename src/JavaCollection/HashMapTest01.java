package JavaCollection;

import java.util.*;

/*
* 1.HashMap集合底层是哈希表/散列表的数据结构
* 2.哈希表是一个怎么样的数据结构呢
*  哈希表是一个数组和单向链表的结合体。
*  数组:在查询方面效率很高,随机增删方面效率很低
*  单向列表:在随机增删方面效率较高 在查询方面效率很低
*  哈希表将以上的两种数据结构融合在一起,充分发挥他们各自的优点
*
* static class Node<K,V> implements Map.Entry<K,V> {
        final int hash;//哈希值(哈希值是Key的hashCode()方法执行结果 hash值通过哈希函数/算法 可以转换存储数组的下标)
        final K key;//存储到Map集合中的那个Key
        V value;//存储到Map集合中的那个value
        Node<K,V> next;//下一个节点的内存地址
        哈希表/散列表 一维数组 这个数组中每一个元素是一个单向链表
*
*       最主要掌握的是 map.put(K,V) v=map.get(k)
*      map.put(K,V)实现原理:
*     第一步:先将k,v封装到Node对象当中
*     第二步:底层会调用K的hashCode()方法得出hash值
*     然后通过哈希函数/哈希算法,将hash值转换成数组的下标,下标位置上如果
*     没有任何元素,就把Node添加到这个位置上了。如果说下标对应的位置上有
*     链表,此时会拿着K和链表上每一个节点中的key进行equals,如果所有的
*     equals方法返回的都是false,那么这个新节点将被添加到链表的末尾,
*     如果其中一个equals返回了true,那么这个节点的value将会被覆盖
*
*    v=map.get(k)实现原理:
*    先调用k的hashCode()方法得出哈希值,通过哈希算法转换成数组下标,通过
*    数组下标快速定位到某个位置上,如果这个位置上什么也没有,返回Null。如果这个
*    位置上有单向链表。那么会拿着参数K和单向链表上的每个节点中的K进行
*    equals,如果所有equals方法返回false,那么get方法返回Null,只要
*    其中有一个节点的k和参数k equals返回true,那么此时这个节点的value
*    就是我们要找的value,get方法最终返回这个要找的value。
*
*    重点:HashMap集合的Key 会先后调用两个方法,一个方法是hashCode()
*    一个方法是equals() 那么这两个方法都需要重写
*
*    HashMap集合中Key的部分特点:无序不可重复
*    为什么无需?因为不一定挂刀哪个单向链表上
*    不可重复如何保证? equals方法来保证HashMap集合的Key不重复
*    如果key重复了 value会覆盖。
*
*   放在HashMap集合Key部分的元素其实就是放到HashSet集合中了。
*   所以HashSet集合中的元素也需要同事重写hashCode()+equals()方法
*
*   HashMap集合的默认初始化值容量是16 默认加载因子是0.75
*   这个默认加载因子是当HashMap集合底层数组的容量达到75%的时候会自动扩容
*   HashMap集合初始化容量必须是2的倍数 这是为了达到散列均匀,提高HashMap存储效率
*
* */
public class HashMapTest01 {
    public static void main(String[] args) {
       Student s1=new Student("zhangsan");
       Student s2=new Student("zhangsan");
       //重写equals方法之前是false
        // System.out.println(s1.equals(s2));

        //没有重写hashCode方法之前 HashCode显示的是内存的地址
        //s1为1956725890 s2为356573597
        System.out.println("s1的HashCode是: "+s1.hashCode());
        System.out.println("s2的HashCode是: "+s2.hashCode());

        Set<Student> set=new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());
    }
}
