package arraysQues;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 18;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    static int[] twoSum(int[] nums, int target){

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 1; j < nums.length-1;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
