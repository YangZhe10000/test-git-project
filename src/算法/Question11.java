package 算法;

public class Question11 {
    public static void main(String[] args) {
            String s="the sky is blue";
            String result=reverseWords(s);
            System.out.println(result);


    }
    public static String reverseWords(String s) {
        StringBuffer sb=new StringBuffer();
        int i=0;
        while(i<s.length()){
            while(i<s.length()&&s.charAt(i)!=' '){
                sb.append(s.charAt(i));
                i++;
            }
            int temp;
            int flag=0;
            for(temp=i;temp<s.length();temp++) {
                if (s.charAt(temp) != ' ') {
                    flag = 1;
                    break;
                }
            }
            if(flag==1&&i>0&&s.charAt(i-1)!=' ') sb.append(' ');
            i++;
        }
        String midcope=sb.toString();
        char c[]=new char[midcope.length()];
        int midcope_begin=0;int midcope_end=midcope.length()-1;
        int j;
        for(j=0;j<midcope.length();j++){
            c[j]=midcope.charAt(j);
        }
        while (midcope_begin<midcope_end){
            char temp;
            temp=c[midcope_begin];
            c[midcope_begin]=c[midcope_end];
            c[midcope_end]=temp;
            midcope_begin++;
            midcope_end--;
        }
        StringBuffer result=new StringBuffer();
        int k=0;
        while(k<c.length){
            String temp="";
            while(k<c.length&&c[k]!=' '){
                temp+=c[k];
                k++;
            }
            temp=reverseEachWord(temp);
            result.append(temp);
            if(k==c.length) break;
            result.append(' ');
            k++;
        }
        return result.toString();
    }
    public static String reverseEachWord(String s){
        char c[]=new char[s.length()];
        int i;
        int begin=0;
        int end=s.length()-1;
        for(i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        while(begin<end){
            char temp=c[begin];
            c[begin]=c[end];
            c[end]=temp;
            begin++;
            end--;
        }
        String result=new String(c);
        return result;
    }
}
