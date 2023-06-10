package 算法;

public class Question19 {
    public static void main(String[] args) {
           String s="rhythms";
           int result=maxVowels(s,3);
        System.out.println(result);

    }
    public static int maxVowels(String s, int k) {
         int i;
         int n=s.length();
         int maxCount=0;
         int nowCount=0;
         for(i=0;i<k;i++){
             if(isVowels(s.charAt(i))) nowCount++;
         }
         maxCount=nowCount;
         for(i=k;i<n;i++){
             if(isVowels(s.charAt(i))) nowCount++;
             if(isVowels(s.charAt(i-k))) nowCount--;
             if(nowCount>maxCount) maxCount=nowCount;
         }
         return maxCount;
    }
    public static boolean isVowels(char c){
        switch (c){
            case 'a': case 'e': case 'i':
            case 'o':case 'u': return true;
            default:return false;
        }
    }
}
