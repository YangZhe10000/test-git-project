package 算法;

public class Question7 {
    public static void main(String[] args) {
        String str1="ababab";
        String str2="abab";
        String str3=gcdOfStrings(str1,str2);
        System.out.println(str3);

    }
    private static String gcdOfStrings(String str1,String str2){
        StringBuffer sb=new StringBuffer();
          int commonLenth=zuiDaGongYueShu(str1.length(),str2.length());
          int i;
          int flag1=0;
          int flag2=0;
           String str1_temp=str1.substring(0,commonLenth);
           String str2_temp=str2.substring(0,commonLenth);
           if(!str1_temp.equals(str2_temp)) return "";
           for(i=1;i<=str1.length()/str1_temp.length();i++){
               sb.append(str1_temp);
           }
           if(sb.toString().equals(str1)) flag1=1;
           sb=new StringBuffer();
          for(i=1;i<=str2.length()/str2_temp.length();i++){
            sb.append(str2_temp);
          }
          if(sb.toString().equals(str2)) flag2=1;
          if(flag1==1&&flag2==1) return str1_temp;
          else return "";

    }
    private static int zuiDaGongYueShu(int beichushu,int chushu){
        if(beichushu>chushu){
            int temp=beichushu;
            beichushu=chushu;
            chushu=temp;
        }
        while (beichushu%chushu!=0){
            int yushu=beichushu%chushu;
            beichushu=chushu;
            chushu=yushu;
        }
        return chushu;
    }
 /*   public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        String T = str1.substring(0, gcd(len1, len2));
        if (check(T, str1) && check(T, str2)) {
            return T;
        }
        return "";
    }
*/
/*    public boolean check(String t, String s) {
        int lenx = s.length() / t.length();
        StringBuffer ans = new StringBuffer();
        for (int i = 1; i <= lenx; ++i) {
            ans.append(t);
        }
        return ans.toString().equals(s);
    }

    public int gcd(int a, int b) {
        int remainder = a % b;
        while (remainder != 0) {
            a = b;
            b = remainder;
            remainder = a % b;
        }
        return b;
    }*/


}
