package collectionHomeWork2;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        Car car1=new Car("宝马",400000);
        Car car2=new  Car("宾利",500000);
        arrayList.add(car1);
        arrayList.add(car2);
        System.out.println(arrayList.contains(car1));
        System.out.println(arrayList.containsAll(arrayList));

    }
}
