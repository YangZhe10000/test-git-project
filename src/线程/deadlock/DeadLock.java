package 线程.deadlock;
/*
* 死锁代码要会写
*
*
* */
public class DeadLock {
    public static void main(String[] args) {
              Object o1=new Object();
              Object o2=new Object();
              //t1 t2 两个线程共享o1 o2
              Thread t1=new MyThread1(o1,o2);
              Thread t2=new MyThread1(o1,o2);


    }
}
class  MyThread1 extends Thread{
    Object o1;
    Object o2;
    public MyThread1(Object o1,Object o2){
             this.o1=o1;
             this.o2=o2;
    }
    public void run(){
        synchronized (o1){
            synchronized (o2){

            }
        }
    }
}
class MyThread2 extends Thread{
    Object o1;
    Object o2;
    public MyThread2(Object o1,Object o2){
        this.o1=o1;
        this.o2=o2;
    }
    public void run(){
        synchronized (o2){
            synchronized (o1){

            }
        }
    }
}
