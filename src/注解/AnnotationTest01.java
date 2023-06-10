package 注解;
/*
*注解是一种引用数据类型
* 怎么自定义注解?语法格式?
* [修饰符列表] @interface 注解类型名{
* }
*
* 注解怎么使用,用在什么地方?
* 第一:注解使用时的语法格式是:
*  @注解类型名
* 第二:注解可以出现在类上、属性上、方法上、变量上 还可以出现在注解类型上
*
*
*  JDK内置了哪些注解呢?
*  java.lang包下的注释类型:
*  掌握:
*  Deprecated 用@Deprecated注释的程序元素,
*  不鼓励程序员使用这样的元素,通常是因为它很危险或存在更好的选择
*
*  Override表示一个方法声明打算重写父类中的另一个方法声明
* */
public class AnnotationTest01 {
      @MyAnnotation
      private  int no;
      @MyAnnotation
      public AnnotationTest01(){}
      @MyAnnotation
      public  static void m1(){}
      @MyAnnotation
      public   void m2(){}
}

