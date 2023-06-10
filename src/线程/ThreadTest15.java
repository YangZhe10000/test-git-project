package 线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/*
*
* 实现线程的第三种方式:实现callable接口
* 这种方式实现的线程可以获取线程的返回值、
* 之前讲解的那两种方式是无法获取线程返回值的,因为run方法返回void
*
*
*
* */
public class ThreadTest15 {
    public static void main(String[] args) {
        //第一步:创建一个"未来任务类"对象 JUC包下 属于java并发包
        FutureTask task=new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call方法相当于run方法
                //线程执行一个任务之后可能会有一个执行结果
                System.out.println("call method begin");
                Thread.sleep(1000*10);
                System.out.println("call method end");
                int a=100;
                int b=200;
                return a+b;//自动装箱变成integer
            }
        });
        //创建线程对象
        Thread t=new Thread(task);
        //启动线程
        t.start();
        //在主线程中 如何获取t线程的返回结果?
        //get()方法的执行 会导致当前线程的阻塞
        try {
            Object obj=task.get();
            //main方法这里的程序要执行必须等待get()方法的结束
            //而get()方法可能需要很久 因为get()方法是为了拿另一个线程的执行结果
            //而另一个线程执行是需要时间的
            System.out.println("线程的执行结果: "+obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
