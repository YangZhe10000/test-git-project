package 算法;

public class 合并交替字符串 {
    public static void main(String[] args) {
        String a="abcdqwer";
        String b="dfg";
        System.out.println(mergeAlternately(a,b));

    }
    private static String mergeAlternately(String word1,String word2){
        int i,j;
        i=0;
        j=0;
        String result ="";
        while(i<word1.length()&&j<word2.length()){
             result+=word1.charAt(i++);
             result+=word2.charAt(j++);
        }
        while(i<word1.length()){
            result+=word1.charAt(i++);
        }
        while (j<word2.length()){
            result+=word2.charAt(j++);
        }
        return result;
    }
}
