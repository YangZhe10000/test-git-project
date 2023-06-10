package 算法;

public class Question12 {
    public static void main(String[] args) {
          int nums[]=new int[]{1,2,3,4};
          int result[]=new int[nums.length];
          result=productExceptSelf(nums);
        for (int i:result
             ) {
            System.out.println(i);
        }
    }
    public static int[] productExceptSelf(int[] nums) {
            int left[]=new int[nums.length];
            int right[]=new int[nums.length];
            left[0]=1;
            int sum=1;
            for(int i=1;i<left.length;i++){
                sum*=nums[i-1];
                left[i]=sum;
            }
            sum=1;
            right[right.length-1]=1;
            for(int i=right.length-2;i>=0;i--){
                sum*=nums[i+1];
                right[i]=sum;
            }

            int result[]=new int[nums.length];
            for(int i=0;i<result.length;i++){
                result[i]=left[i]*right[i];
            }
            return result;
    }

}
