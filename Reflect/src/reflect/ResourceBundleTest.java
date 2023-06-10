package reflect;

import java.util.ResourceBundle;

/*
* java.util包下提供了一个资源帮顶起,便于获取属性配置文件
* 使用一下这种方式的时候,属性配置文件必须放在类路径下
*
*
* */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //只能绑定xxx.properties文件 并且必须在类路径下(src下)
        //并且在写路径的时候,路径后面的扩展名不能写
        ResourceBundle bundle=ResourceBundle.getBundle("classinfo");
        String className=bundle.getString("className");
        System.out.println(className);
    }
}
