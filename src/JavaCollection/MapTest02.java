package JavaCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    public static void main(String[] args) {
        //Map集合的遍历
        //第一种方式:获取所有的key,通过遍历key,来遍历value
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");
        //遍历Map集合
        //获取所有的key 所有的Key是一个Set集合
        Set<Integer> keys=map.keySet();
        //遍历Key 通过key获取value
        Iterator<Integer> it=keys.iterator();
        while (it.hasNext()){
            Integer key=it.next();
            String value=map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("-----------------------------------");
        //第二种方式:Set<Map.Entry<K,V>> entrySet();
        //以上这个方法是把Map集合全部转换成Set集合 Set中元素的类型是Map.entry<K,V>

        Set<Map.Entry<Integer,String>> set=map.entrySet();
        //遍历Set集合 每一次取出一个Node
        Iterator<Map.Entry<Integer,String >> iterator=set.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> Node=iterator.next();
            Integer key=Node.getKey();
            String value=Node.getValue();
            System.out.println(key+"="+value);

        }
    }
}
