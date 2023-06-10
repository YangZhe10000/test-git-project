package 反射;

public class AboutPath {
    public static void main(String[] args) {
        //在反射代码中 一旦其中的路径代码离开了IDEA 换到了其他位置
        //当前的路径有可能就不是Project了 代码就会出错
        //接下来将会说一种比较通用的路径。即使代码换位置
        //这样的编写还是有用的

        //什么类路径下? 方式在src下的都是在路径下。
        //src是类的根路径

        //getContextClassLoader() 是线程对象的方法 可以获取到当前线程的类加载器对象
        //getResource() 这是类加载器对象的方法,当前线程的类加载器默认从类的根路径加载对象
        //


        //这里空指针异常 详情看Reflect模块里的案例
        String path=Thread.currentThread().getContextClassLoader().
                getResource("classinfo.properties").getPath();
        System.out.println(path);
    }
}
