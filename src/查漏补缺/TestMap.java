package 查漏补缺;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        map.put(1,"zhang");
        map.put(2,"yang");
        map.put(3,"qi");
        map.put(4,"sss");
        Set set=map.keySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            Object key=iterator.next();
            Object value=map.get(key);
            System.out.println(key+" : "+value);
        }
        Set entrySet=map.entrySet();
        Iterator iterator1=entrySet.iterator();
        while (iterator1.hasNext()){
            Object obj=iterator1.next();
            Map.Entry entry= (Map.Entry) obj;
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        /*for (Map.Entry<Object,Object> entry:map.entrySet()) {

        }*/
    }
}
