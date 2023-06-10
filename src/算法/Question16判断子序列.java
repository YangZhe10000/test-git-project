package 算法;

public class Question16判断子序列 {
    public static void main(String[] args) {
            int nums[]=new int[]{1,8,6,2,5,4,8,3,7};
            int result=maxArea(nums);
        System.out.println(result);
    }
    public static int maxArea(int[] height) {
         int nowArea;
         int tempArea;
         int right=height.length-1;
         int left=0;
         nowArea=Math.min(height[left],height[right])*(right-left);
         while(left<right){
             if(left<right&&height[left]<height[right])
                 left++;
             else if(left<right&&height[left]>height[right])
                 right--;
             else if(left<right&&height[left]==height[right]){
                 if(height[left+1]>height[right-1]) left++;
                 else right--;
             }
             tempArea=Math.min(height[left],height[right])*(right-left);
             if(tempArea>nowArea)
                 nowArea=tempArea;
         }
         return nowArea;
    }

}
