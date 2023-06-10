package 算法;

public class Question10 {
    public static void main(String[] args) {
            String s="leetcode";
            String result=reverseVowels(s);
         System.out.println(result);
    }
    public static String reverseVowels(String s) {
            int end=s.length()-1;
            int begin=0;
            int i;
            char c[]=new char[s.length()];
            for(i=0;i<=end;i++){
                c[i]=s.charAt(i);
            }

            while (begin<end){
                while (begin<end&&judge(s.charAt(begin))){
                    begin++;
                }
                while (begin<end&&judge(s.charAt(end))){
                    end--;
                }
                if(begin<end){
                    char temp;
                    temp=c[begin];
                    c[begin]=c[end];
                    c[end]=temp;
                    begin++;
                    end--;
                }

            }
            String result=new String(c);

            return result;
    }
    public static boolean judge(char c){
        switch (c){
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case'E': case 'I': case 'O': case 'U':return false;
            default:return true;
        }
    }
}
