package collectionHomeWork3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPractise {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);
        System.out.println(m);
        m.put("jack",2600);
        System.out.println(m);
        Set keyset=m.keySet();
        for(Object key:keyset){
            m.put((String) key,(Integer)m.get(key)+100);
        }
        System.out.println(m);
        for(String Key:m.keySet()){
            System.out.println("key: "+Key+" value:"+m.get(Key));
        }
    }
}
