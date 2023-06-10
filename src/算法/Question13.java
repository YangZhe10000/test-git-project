package 算法;

public class Question13 {
    public static void main(String[] args) {
        int nums[]=new int[]{3,1,2,5,4};
        boolean result=increasingTriplet(nums);
        System.out.println(result);
    }
    public static  boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        if(n<3) return false;
        int[] leftmin=new int[n];
        leftmin[0]=nums[0];
        int min,max;
        min=leftmin[0];
        for(int i=1;i<n;i++){
           if(nums[i]<leftmin[i-1]) min=nums[i];
           leftmin[i]=min;
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=nums[n-1];
        max=rightMax[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i]>rightMax[i+1]) max=nums[i];
            rightMax[i]=max;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>leftmin[i]&&nums[i]<rightMax[i]) return true;
        }
         return false;
    }
}
