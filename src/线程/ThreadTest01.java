package 线程;
/*
*
* 分析以下程序,有几个线程,除垃圾回收线程之外,有几个线程?
*  1个线程 (因为只有一个栈)
* */
public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }

    private static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 begin");
    }

    private static void m3() {
        System.out.println("begin");
    }
}
