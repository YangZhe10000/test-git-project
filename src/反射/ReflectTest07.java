package 反射;

import java.lang.reflect.Field;

/*
* 必须掌握:
* 怎么通过反射机制访问一个Java对象的属性?
* 给属性赋值set
* 获取属性的值get
*
* */
public class ReflectTest07 {
    public static void main(String[] args) {
        //我们不使用反射机制,怎么去访问一个对象的属性呢?

        try {
            Class studentClass= Class.forName("反射.Student");
            Object obj=studentClass.newInstance();
            //获取单个属性(属性根据属性的名称来获取Field)
            Field noField=studentClass.getDeclaredField("no");
            //给obj对象(Student对象)的no属性复制
            noField.set(obj,22222);//给obj对象的no属性赋值(要记住)
            /*
            * 虽然使用了反射机制,但是三要素还是缺一不可
            * 要素1:obj对象(newInstance() 方法 虽然已经过时)
            * 要素2:no属性(获取 getDeclaredField)
            * 要素3:22222赋值(set方法)
            *
            *
            * */
            //读取属性的值
            System.out.println(noField.get(obj));//返回的是一个Obj对象
            //很明显 私有的属性无法访问
            Field nameField=studentClass.getDeclaredField("name");
            //访问私有属性必须打破封装
            nameField.setAccessible(true);
            nameField.set(obj,"jackson");
            System.out.println(nameField.get(obj));
        } catch (ClassNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
