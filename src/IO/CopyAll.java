package IO;

import java.io.*;

public class CopyAll {
    public static void main(String[] args) {
        //拷贝源
        File srcfile=new File("D:\\一级目录");
        //拷贝目标
        File destFile=new File("E:\\");
        //调用方法拷贝
        copyDir(srcfile,destFile);
    }

    private static void copyDir(File srcFile,File destFile){
        if(srcFile.isFile()){
            //如果src是一个文件的话 递归结束
            FileInputStream fis=null;
            FileOutputStream fos=null;
            try {
                //比如说 我要将D:\一级目录\二级目录\sxc.txt文件写入 也就是源文件
                //只需要将源文件的 D:\去掉 也就是srcFile.subString(3) 得到后面的路径
                //然后和E:// 也就是你的目标路径拼接 就是destFile.getAbsolutePath()
                fis=new FileInputStream(srcFile);
                String path=(destFile.getAbsolutePath().endsWith("\\")?destFile.getAbsolutePath():destFile.getAbsolutePath()+"\\")
                        +srcFile.getAbsolutePath().substring(3);
                fos=new FileOutputStream(path);

                //一边读一边写
             byte[] bytes=new byte[100*1024];//100kb
                int readCount=0;
                while((readCount=fis.read(bytes))!=-1){
                    fos.write(bytes,0,readCount);
                }
                fos.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if(fos!=null){
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(fis!=null){
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }

            return;
        }
       //获取源下面的子目录
        File[] files=srcFile.listFiles();
        for(File file:files){
            //获取所有文件(包括目录和文件)的绝对路径
            //System.out.println(file.getAbsolutePath());
            if(file.isDirectory()){
                String strDir=file.getAbsolutePath();
                //String destDir="E:\\"+strDir.substring(3);
                //这里不能写死 应该从上面获得
                //如果 上面的路径为 D:\\a\\b\\c\\d\\ 那么系统会把最后d后面那个斜杠给漏掉
                //很明显这不是预期的结果 所以需要在改进
                String destDir=(destFile.getAbsolutePath().endsWith("\\")? destFile.getAbsolutePath(): destFile.getAbsolutePath()+"\\")+strDir.substring(3);
                System.out.println(destDir);
                File newFile=new File(destDir);
                //如果不存在 则创建
                if(!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            //递归调用
            copyDir(file,destFile);
        }
    }
}
