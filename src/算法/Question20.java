package 算法;
//最大连续1的个数
public class Question20 {
    public static void main(String[] args) {
        int nums[]=new int[]{0,1,1,1,0,1,1,0,1};
        int result=longestOnes(nums,2);
        System.out.println(result);
    }
    public static int longestOnes(int[] nums, int k) {
             int slidingWindowLength=0;
             int max=0;
             int countZero=0;
             int left=0;
             int right=k;
             slidingWindowLength=k;
             for(int i=0;i<k;i++){
                 if (nums[i]==0) countZero++;
             }
             max=slidingWindowLength;
             while(right<nums.length){
                   if(nums[right]==1) slidingWindowLength++;
                   else {
                       slidingWindowLength++;
                       countZero++;
                   }
                   while (countZero>k){
                       if(nums[left]==0) {
                           countZero--;
                       }
                       left++;
                       slidingWindowLength--;
                   }
                right++;
                if(slidingWindowLength>max) max=slidingWindowLength;
             }
             return max;
    }
}
