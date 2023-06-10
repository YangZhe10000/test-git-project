package 反射;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//反射属性Field
public class ReflectTest05 {
    public static void main(String[] args) {
          //Field翻译为字段,其实就是属性/成员
        try {
            //获取整个类
            Class StudentClass=Class.forName("反射.Student");
            //获取类中所有的public修饰的Field
            Field[] fields=StudentClass.getFields();
            System.out.println(fields.length);//测试数组中只有一个元素
            //取出这个Field
            Field f=fields[0];
            System.out.println(f.getName());
            //获取所有的Field
            Field[] fs=StudentClass.getDeclaredFields();
            System.out.println(fs.length);
            //遍历
            for(Field field:fs){
                //获取属性的修饰符列表
                int i=field.getModifiers();//返回的是一个数字 每个数字都是修饰符的一个代号
                System.out.println(i);
                String modifierString= Modifier.toString(i);
                System.out.println(modifierString);

                //获取属性的类型
                Class fieldType=field.getType();
                String fName=fieldType.getName();
                System.out.println(fName);
                //获取属性的名字
                System.out.println(field.getName());
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
class Student{
    //4个Field,分别采用了不太的访问控制权限修饰符
    public int no;
    private  String name;
    protected int age;
    boolean sex;

}

