package IO;

import java.io.File;
import java.io.IOException;

/*
* File类和四大家族没有关系 File类不能完成文件的读和写
* File对象代表 文件和目录路径名的抽象表示形式
* C:\Driver 这是一个File对象
* C:\Driver\lan\Realtek\Readme.txt 也是File对象
* 一个File对象有可能对应的是目录,也可能是文件
* File只是一个路径名的抽象表示形式
*
* 需要掌握File类常用的方法:
*
*
* */
public class FileTest01 {
    public static void main(String[] args) {
       File f1=new File("D:\\file");
        System.out.println(f1.exists());//判断是否存在

        //如果D盘下的File不存在 则以文件的形式创建出来
        if(!f1.exists()){
            //以文件形式创建
            //f1.createNewFile();
            //以目录形式创建
            f1.mkdir();//make directory
        }
        //可以以多重目录创建
        File f2=new File("D:\\一级目录\\二级目录\\三级目录");
        if(!f2.exists()){
            f2.mkdirs();//创建多级目录
        }
        String parentPath=f2.getParent();//获取父级目录
        System.out.println(parentPath);
        File parentFile=f2.getParentFile();
        System.out.println("获取绝对路径: "+parentFile);
        File f4=new File("nmsl");
        System.out.println("nmsl的绝对路径: "+f4.getAbsolutePath());


    }
}
