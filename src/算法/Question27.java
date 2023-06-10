package 算法;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//行转列
public class Question27 {
    public static void main(String[] args) {

    }
    public static int equalPairs(int[][] grid) {
     int result=0;
     int grid2[][]=new int[grid[0].length][grid.length];
     for(int i=0;i<grid.length;i++){
         for(int j=0;j<grid[0].length;j++) grid2[j][i]=grid[i][j];
     }
     for(int i=0;i<grid.length;i++){
         for(int j=0;j<grid2.length;j++){
             if(Arrays.equals(grid[i],grid2[j])) result++;
         }
     }
    return result;

    }
}
