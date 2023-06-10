package 算法;
//找到最高海拔
public class Question22 {
    public static void main(String[] args) {
            int gain[]=new int[]{-5,1,5,0,-7};
            int result=largestAltitude(gain);
            System.out.println(result);
    }
    public static int largestAltitude(int[] gain) {
        int max;
         int altitude[]=new int[gain.length+1];
         altitude[0]=0;
         max=altitude[0];
         for(int i=1;i<altitude.length;i++){
             altitude[i]=altitude[i-1]+gain[i-1];
         }
         for(int i=0;i<altitude.length;i++){
             if(altitude[i]>max) max=altitude[i];
         }
         return max;
    }
}
