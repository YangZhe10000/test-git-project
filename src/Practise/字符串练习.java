package Practise;

import java.util.Scanner;

public class 字符串练习 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个字符串");
//        String str = sc.next();
//        for(int i=0;i<str.length();i++){
//            char c = str.charAt(i);
//            System.out.println(c);
//        }

        StringBuilder sb=new StringBuilder();
        sb.append("abc");
        sb.append("sew");
        sb.append("wer");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String result=sb.toString();
        System.out.println(result);
    }
}
