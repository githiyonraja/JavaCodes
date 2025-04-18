package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,4,4,5};
        System.out.println(removeDuplicates(nums));

    }
    static int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i = 1 ; i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
