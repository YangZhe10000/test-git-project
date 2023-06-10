package 算法;

public class Question9 {
    public static void main(String[] args) {
        int flowerd[]={1,0,0,0,1};
        boolean result=canPlaceFlowers(flowerd,2);
        System.out.println(result);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
             int i=0;
             int count=0;
             for(i=0;i<flowerbed.length;i++){
                 if(flowerbed.length==1){
                     if(flowerbed[0]==1&&n==0) return true;
                     else if(flowerbed[0]==0&&n==1) return true;
                     else if(flowerbed[0]==0&&n==0) return true;
                     else return false;
                 }
                 if(i==0&&flowerbed[i]==0&&flowerbed[i+1]==0){
                     flowerbed[i]=1;
                     n--;
                 }
                 else if(i>0&&i<flowerbed.length-1){
                     if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0){
                         flowerbed[i]=1;
                         n--;
                     }
                 }
                 else if(i==flowerbed.length-1){
                     if(flowerbed[i-1]==0&&flowerbed[i]==0){
                         flowerbed[i]=1;
                         n--;
                     }
                 }

             }
             if(n<=0) return true;
             else return false;
    }
}
