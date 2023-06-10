package 查漏补缺;

public class finally和Return {
    public static void main(String[] args) {
        System.out.println(add());
    }
    private static int add(){
        try {
            int result=9/0;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("try程序段结束了");
        }

        return 0;
    }
}
