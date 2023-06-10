package 注解;
/*
* @Override出现在方法上
* @Override这个注解是给编译器参考的,和运行阶段没有关系
* 凡是java中的方法带有这个注解的,编译器都会进行编译检查
* 如果这个方法不是重写父类的方法,编译器报错
* */
public class AnnotationTest02 {
    @Override
    public String toString() {
        return "super.toString();";
    }
}
