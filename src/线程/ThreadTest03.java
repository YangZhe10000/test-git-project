package 线程;

public class                                      ThreadTest03 {
    public static void main(String[] args) {
        //创建一个可运行对象
        //MyRunnable myRunnable=new MyRunnable();
        //将可运行的对象封装成一个线程对象
        //Thread t=new Thread(myRunnable);
        Thread t=new Thread(new MyRunnable2());
        //启动线程
        t.start();
        for(int i=0;i<1000;i++){
            System.out.println("主线程--->"+i);
        }
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("分支线程--->"+i);
        }
    }
}
