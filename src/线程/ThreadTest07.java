package 线程;
/*
* 关于Thread.sleep()方法的一个面试题
*
*  !!!!!!
*  sleep是一个静态方法 和对象没有关系
* */
public class ThreadTest07 {
    public static void main(String[] args) {
         //创建线程对象
        MyThread3 t=new MyThread3();
        t.setName("t");
        t.start();

        //调用sleep方法
        try {
            t.sleep(1000*5);//在执行的时候还是会转换成MyThread.sleep
            //这行代码的作用是 让Main方法进入休眠
            //这行代码出现在Main方法里 Main线程睡眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("helloworld");
    }
}
class MyThread3 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"----->"+i);
        }
    }
}
