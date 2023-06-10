package 算法;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question24 {
    public static void main(String[] args) {
        int nums1[]=new int[]{1,2,3};
        int nums2[]=new int[]{2,4,6};
        List<List<Integer>> ans=new ArrayList<>();
        ans=findDifference(nums1,nums2);
        System.out.println(ans);

    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(!set2.contains(nums1[i])&&!list1.contains(nums1[i]))
                list1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(!set1.contains(nums2[i])&&!list2.contains(nums2[i]))
                list2.add(nums2[i]);
        }
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}
