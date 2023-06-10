package 线程;
/*
*  实现线程的第一种方式:
*   编写一个类,直接继承java.lang.Thread 重写run方法
*
*  怎么创建线程对象?
*  怎么启动线程呢?
*
*
* */
public class ThreadTest02 {
    public static void main(String[] args) {
        //这里是main方法,这里的代码属于主线程,在主栈中运行
        //新建一个分支线程对象
        MyThread myThread =new MyThread();
        myThread.start();//start()方法的作用是
        //myThread.run(); 直接调用run方法 没有开辟新的线程
        //在Jvm中开辟一个新的栈空间 启动一个分支线程
        //这段代码的任务只是为了开启一个新的栈空间,只要新的栈空间开出来,start()方法就结束了 线程就启动了
        //启动成功的线程会自动调用run方法 并且run方法在分支栈的底部(压栈)
        //run方法在分支线的栈底部 main方法在主栈的栈底部。run和main是平级的
        for(int i=0;i<1000;i++){
            System.out.println("主线程--->"+i);
        }

    }
}
class MyThread extends Thread{
    public void run(){
        //编写程序,这段程序运行在分支线程中。
         for(int i=0;i<1000;i++){
             System.out.println("分支线程--->"+i);
         }
    }
}
