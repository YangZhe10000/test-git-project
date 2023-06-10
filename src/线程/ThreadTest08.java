package 线程;
/*
*
* 如何唤醒一个处于睡眠状态的线程
* 注意:唤醒并非中断一个线程的执行
*
* */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t=new Thread(new MyRunnable2());
        t.setName("t");
        t.start();
        try {
            //希望5秒之后,t线程醒来
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止t线程的睡眠
        //这种中断睡眠的方式 利用了java的异常处理机制
        t.interrupt();//干扰
    }
}

class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        //run方法中的异常只能try catch 因为子类不能抛出比父类更多的异常
        System.out.println(Thread.currentThread().getName()+"begin");
        try {
            Thread.sleep(1000*60*60*24*365);//休眠一年

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"end");
    }
}
