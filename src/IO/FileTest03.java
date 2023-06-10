package IO;

import java.io.File;

/*
*
*
* File中的ListFiles方法
*
* */
public class FileTest03 {
    public static void main(String[] args) {
         //File[] listFiles()
        //获取当前目录下所有的子文件
        File f=new File("D:\\study");
        File[] files=f.listFiles();
        for(File file:files){
            System.out.println(file.getAbsolutePath());
        }
    }
}
