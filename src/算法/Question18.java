package 算法;

public class Question18 {
    public static void main(String[] args) {
        int nums[]=new int[]{1,12,-5,-6,50,3};
        double result=findMaxAverage(nums,4);
        System.out.println(result);
    }
    //子数组最大平均数
    public static double findMaxAverage(int[] nums, int k) {
           int count=nums.length-k+1;
           int sum=0;
           for(int i=0;i<k;i++){
               sum+=nums[i];
           }
           int left=0;
           int right=k-1;
           double temp;
           double average=(double)sum/k;
           for(int i=0;i<count-1;i++){
               sum+=nums[++right];
               sum-=nums[left++];
               temp=(double)sum/k;
               if(temp>average){
                   average=temp;
               }
           }
           return average;
    }
    public static double findMaxAverageOffical(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return 1.0 * maxSum / k;
    }


}
