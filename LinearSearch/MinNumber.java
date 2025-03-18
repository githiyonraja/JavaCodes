package LinearSearch;

public class MinNumber {
    public static void main(String[] args) {
        int[] nums = {2,4,55,63,-6,0};
        System.out.println(minValue(nums));
    }
    static int minValue(int[] nums){
        int min = nums[0];

        for(int i = 0 ;i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}
