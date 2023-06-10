package 线程;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

/*
* 1.使用wait方法和notify方法实现"生产者消费者模式"
* 2.什么是生产者消费者模式？
*  生产线程负责生产 消费线程负责消费
*  生产线程和消费线程要达到均衡
*  这是一种特殊的业务需求 在这种特殊的情况下需要使用wait方法和notify方法
* 3.wait 和 notify方法不是线程对象的方法,是普通java对象都有的方法
* 4.wait方法和notify方法建立在线程同步的基础之上。因为要多线程操作一个仓库
*
* 接下来开始模拟:
*  仓库采用List集合
*   List集合中假设只能存储一个元素
*   1个元素就表示仓库满了
*  如果List集合中元素个数是0 就表示仓库空了
*
*
* */
public class ThreadTest16 {
    public static void main(String[] args) {
        //创建一个仓库对象
        List list=new ArrayList();
        //创建两个线程对象
        Thread t1=new Thread(new Producer(list));
        Thread t2=new Thread(new Consumer(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();
    }
}
//生产线程
class Producer implements Runnable{
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //一直生产
        while (true){
            synchronized (list){
                if(list.size()>0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到这儿说明仓库是空的 可以生产
                Object obj=new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+"--->"+obj);
                //唤醒消费者可以消费
                list.notify();

            }

        }
    }
}
//消费线程
class Consumer implements Runnable{
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
     //一直消费
        while (true){
            synchronized (list){
                if(list.size()==0){
                    try {
                        //仓库已经空了
                        //消费者线程等待,释放掉list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到这儿说明仓库有数据 进行消费
                Object obj=list.remove(0);
                System.out.println(Thread.currentThread().getName()+"--->"+obj);
                //唤醒生产者进行生产
                list.notifyAll();
            }
            
        }
    }
}

