package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {4,65,5},
                {2,34,8,77},
                {9,86,12,48,53},
                {100,125}
        };
        int target = 77;
        int[] ans = search2D(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2D(int[][] nums,int target){
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if(nums[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
