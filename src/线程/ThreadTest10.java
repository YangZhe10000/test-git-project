package 线程;

public class ThreadTest10 {
    public static void main(String[] args) {
         MyRunnable4 t4=new MyRunnable4();
         Thread t=new Thread(t4);
         t.setName("t");
         t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程
        t4.run=false;

    }
}
class MyRunnable4 implements Runnable{
    //打一个Boolean标记
     boolean run=true;
    @Override
    public void run() {
        for(int i=1;i<10;i++){
            if(run) {
                System.out.println(Thread.currentThread().getName() + "---->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //在这里可以保存你需要的数据
                
                //终止
                return;
            }
        }
    }
}