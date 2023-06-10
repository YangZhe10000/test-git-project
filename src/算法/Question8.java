package 算法;

import java.util.ArrayList;
import java.util.List;

public class Question8 {
    public static void main(String[] args) {
        int candies[]={2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> result=new ArrayList(candies.length);
        result=kidsWithCandies(candies,extraCandies);

        for (Boolean i:result
             ) {
            System.out.println(i);
        }
    }
    private static List<Boolean> kidsWithCandies(int candies[], int extraCandies){
        List result=new ArrayList<Boolean>(candies.length);
        int i;
        int max=candies[0];
        for(i=1;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                result.add(true);
            }
            else result.add(false);
        }
        return result;
    }

}
