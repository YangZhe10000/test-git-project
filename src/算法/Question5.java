package 算法;

import java.util.HashMap;
import java.util.Map;

public class Question5 {
    public static void main(String[] args) {
        String s="LVIII";
        System.out.println(romanToInt(s));

    }
    public static int romanToInt(String s){
        Map<Character,Integer> map=init();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length()) {
                char temp = s.charAt(i);
                char temp1 = s.charAt(i + 1);
                if (map.get(temp) < map.get(temp1))
                    sum += (-1) * map.get(temp);
                else
                    sum += map.get(temp);
            }
            else
                sum=sum+map.get(s.charAt(i));
        }
        return sum;
    }
    public static Map<Character,Integer> init(){
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        return map;
    }
}
