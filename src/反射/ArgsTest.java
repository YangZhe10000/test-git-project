package 反射;
/*
* 可变长参数
* int... args 这就是可变长参数
* 语法是:类型... (注意:一定是3个点)
*
*
* */
public class ArgsTest {
    public static void main(String[] args) {
      m();
      m(10);
      m(10,20);
      m2(10,"abc");
    }

    public  static void m(int... args){
        System.out.println("m方法执行了");
    }
    //可变长参数必须是参数列表最后一个 并且只能出现一个
    public static void m2(int args1,String... args2){

    }

}
