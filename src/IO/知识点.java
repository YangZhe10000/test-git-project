package IO;

public class 知识点 {
    /*1.关于IO的分类:一种是按流的方向进行分类:
      从硬盘读数据到内存中叫做输入/读  从内存中出来到硬盘叫做输出/写
    * 另一种方式是按照读取数据方式不同进行分类:
    有的流是按照字节的方式读取数据,一次读取一个字节byte,等同于一次读取8个二进制字符,这种流是万能的
    *什么类型的文件都可以读取。包括:文本文件,图片,声音文件,视频
    *
     有的流是按照字符的方式读取数据的,一次读取一个字符,这种流是为了方便读取普通文本文件(txt)而存在的
      这种流不能读取图片,声音,视频等文件,连word文件都读取不了因为word文件有格式
    *  综上所述分为四类: 输入输出流 字节字符流
    * 2.java IO流这块有四大家族
      四大家族的首领:
    * java.io.InputStream 字节输入流
      java.io.OutputStream 字节输出流

      java.io.Reader  字符输入流
      java.io.Writer  字符输出流

      四大家族的首领都是抽象类
      3.所有的流都实现了:
      java.io.Closeable接口,都是可关闭的,都有close()方法。
      流毕竟是一个管道,这个是内存和硬盘之间的通道,用完之后一定要关闭。
      不然会耗费很多资源

      4.所有的输入流都实现了:
      java.io.Flushable接口,都是可刷新的,都有flush方法。
      在输出流完成最终输出后,一定要记得flush()刷新一下,这个刷新表示将
      通道当中剩余的未输出的数据强行输出完(清空管道),如果没有flush()有可能
      会导致丢失数据
      注意:在java中只要"类名"以Stream结尾的都是字节流,以"Reader/Writer"结尾的都是字符流

       5.java.io包下需要掌握的流有16个
       文件专属:
       java.io.FileInputStream
       java.io.FileOutputStream
       java.io.FileReader
       java.io.FileWriter

       转换流(将字节流转换成字符流):
       java.io.InputStreamReader
       java.io.OutputStreamWriter

       缓冲流专属:
       java.io.BufferedReader
       java.io.BufferedWriter
       java.io.BufferedInputStream
       java.io.BufferedOutputStream

       数据流专属:
       java.io.DataInputStream
       java.io.DataOutputStream

       标准输出流
       java.io.PrintWriter
       java.io.PrintStream

       对象专属流:
       java.io.ObjectInputStream
       java.io.ObjectOutputStream
    */

}
