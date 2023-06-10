package 算法;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question25 {
    public static void main(String[] args) {

    }
    public static boolean uniqueOccurrences(int[] arr) {
         Map<Integer,Integer> occur=new HashMap<Integer,Integer>();
         for(int val:arr){
             occur.put(val,occur.getOrDefault(val,0)+1);
         }
         Set<Integer> times=new HashSet<Integer>();
         for(Map.Entry<Integer,Integer> entry:occur.entrySet()){
             times.add(entry.getValue());
         }
         return times.size()==occur.size();
    }
}
