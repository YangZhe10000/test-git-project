package 反射;

import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest06 {
    public static void main(String[] args) {
        //创建这个是为了拼接字符串
        StringBuilder s=new StringBuilder();
        try {
            Class studentClass=Class.forName("java.lang.String");
            s.append(Modifier.toString(studentClass.getModifiers())+" class "+studentClass.getSimpleName()+"{"+"\n");//append 添加
            Field[] fields=studentClass.getDeclaredFields();
            for(Field field:fields){
                   s.append("\t");
                   s.append(Modifier.toString(field.getModifiers()));
                   s.append(" ");
                   s.append(field.getType().getSimpleName());
                   s.append(" ");
                   s.append(field.getName());
                    s.append(";\n");
            }
            System.out.println(s);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
