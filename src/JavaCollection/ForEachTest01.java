package JavaCollection;

/*
* JDK5.0之后推出了一个新特性:叫做增强for循环或者叫做foreach
*
* */

public class ForEachTest01 {
    public static void main(String[] args) {
        int arr[]={2,4,8,7,9,6,3,5};
        /*
        遍历数组:普通for循环
        * */
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //增加for(foreach)
        /*
        * for(元素类型 变量名: 数组或集合){
        * System.out.println(变量名);
        * }
        * */
        for(int data:arr){
            System.out.println(data);
        }
    }
}
