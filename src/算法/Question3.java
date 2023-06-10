package 算法;

public class Question3 {
    public boolean find(int a[][],int target){
        if(a==null||a.length==0)
            return false;
        int left=0;
        int right=a.length*a[0].length-1;
        int col=a[0].length;
        while (left<right){
            int mid=(right-left)/2;
            int value=a[mid/col][mid%col];
            if(value==target)
                return true;
            else if (value<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int i=Integer.parseInt("222");
        System.out.println();

    }
}
