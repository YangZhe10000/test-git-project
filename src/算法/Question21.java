package 算法;
//删除一个元素以后全为1的最长子数组
public class Question21 {
    public static void main(String[] args) {
        int nums[]=new int[]{1,1,1};
        int result=longestSubarray(nums);
        System.out.println(result);
    }
    public static int longestSubarray(int[] nums) {
        int max=0;
        int left=0;
        int right=0;
        int countZero=0;
        int slideWindowLength=0;
        while(right<nums.length){
            if(nums[right]==1){
                slideWindowLength++;
            }
            else{
                countZero++;
                slideWindowLength++;
            }
            while (countZero>1){
                if(nums[left++]==0){
                    countZero--;
                }
                slideWindowLength--;
            }
            right++;
            if(slideWindowLength>max){
                max=slideWindowLength;
            }
        }

        return max-1;
    }
}
