package 算法;

import java.util.Arrays;

//哈希
public class Question26 {
    public static void main(String[] args) {
       String word1="cabbba";
       String word2="abbccc";
        System.out.println(closeStrings(word1,word2));
    }
    public static boolean closeStrings(String word1, String word2) {
           int length1=word1.length();
           int length2=word2.length();
           if(length1!=length2) return false;
           int struct1[]=new int[26];
           int struct2[]=new int[26];
           for(int i=0;i<length1;i++){
               struct1[word1.charAt(i)-'a']++;
               struct2[word2.charAt(i)-'a']++;
           }
        for(int i=0;i<26;i++){
            System.out.println(struct1[i]^struct2[i]);
            if((struct1[i]^struct2[i])==1) return false;
            /*if(struct1[i]>0&&struct2[i]==0) return false;
            if(struct1[i]==0&&struct2[i]>0) return false;*/
        }
        Arrays.sort(struct1);
        Arrays.sort(struct2);
        for(int i=0;i<struct1.length;i++){
            if(struct1[i]!=struct2[i]) return false;
        }
        return true;
    }
}
