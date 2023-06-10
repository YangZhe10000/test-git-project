package 算法;
//将字符串中的空格进行替换

public class Question4 {
    public static String replaceSpace(StringBuffer str){
        if(str==null)
            return null;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(String.valueOf(str.charAt(i)).equals(" "))
                sb.append("%20");
            else
                sb.append(str.charAt(i));
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        String str="my new friend";
        StringBuffer sb=new StringBuffer(str);
        System.out.println(replaceSpace(sb));
    }
}
