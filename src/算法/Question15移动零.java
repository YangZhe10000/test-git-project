package 算法;

public class Question15移动零 {
    public static void main(String[] args) {
       int nums[]=new int[]{0,1,0,3,12};
       moveZeroes(nums);
        for (int i:
             nums) {
            System.out.println(i);
        }
    }
    public static void moveZeroes(int[] nums) {
        int length=nums.length;
//        if(length>1){
//            for(int i=0;i<nums.length;i++){
//                if(nums[i]==0){
//                    for(int j=i+1;j<nums.length;j++){
//                       if(nums[j]!=0){
//                           int temp=nums[i];
//                           nums[i]=nums[j];
//                           nums[j]=temp;
//                           break;
//                       }
//                   }
//                }
//
//            }
//        }
        int i,j=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        for(;j<nums.length;j++){
            nums[j]=0;
        }
    }
}
