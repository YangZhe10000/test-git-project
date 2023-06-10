package 查漏补缺;

public class Father {
    int b =100;
    public Father() {
        System.out.println("fater的属性 b的值:"+b );
        method();
        b=1000;

    }
    public void method() {
        System.out.println("Father_method()="+b);
    }

}
