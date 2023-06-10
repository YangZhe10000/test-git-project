package 查漏补缺;

public class child extends Father{
    int b = 10;
    public child() {
        b = 10000;
    }
    public void method() {
        System.out.println("Son_method()="+b);
    }

}
