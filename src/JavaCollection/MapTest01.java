package JavaCollection;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"zhangsan");//自动装箱
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");
        //通过key获取value
        System.out.println(map.get(2));

        //获取键值对数量
        System.out.println("键值对数量: "+map.size());

        //通过Key删除key-value
        map.remove(2);
        System.out.println("键值对数量: "+map.size());

        //判断是否包含某个key
        //contains底层调用的都是equals
        System.out.println("是否包含某个名字为1的key: "+map.containsKey(1));

        //判断是否包含某个value
        System.out.println("是否包含wangwu这个value: "+map.containsValue("wangwu"));

        //获取所有的value
        Collection<String> collection= map.values();
        for(String s:collection){
            System.out.println(s);
        }
        //清空map集合
        map.clear();

        //判断是否为空
        System.out.println("当前Map是否为空"+map.isEmpty());


    }
}
