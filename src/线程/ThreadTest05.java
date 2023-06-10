package 线程;
/*
* 怎么获取线程对象呢
* static Thread currentThread()
*
*
* */
public class ThreadTest05 {
    public static void main(String[] args) {

        //currentThread就是当前线程对象
        //这个代码出现在Main方法中,所以当前线程就是主线程
        Thread currentThread=Thread.currentThread();

        //获取主线程名字
        String currentThreadName=currentThread.getName();
        System.out.println(currentThreadName);//名字是main

        MyThread2 t=new MyThread2();
        //设置线程的名字
        t.setName("t线程");
        //获取线程的名字
        String Tname=t.getName();
        //输出
        System.out.println(Tname);//默认名字是Thread-0
        t.start();
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("分支线程--->"+i);
        }
    }

}
