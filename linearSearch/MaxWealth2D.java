package linearSearch;

public class MaxWealth2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},{3,2,1}
        };
        System.out.println(maxWealth(arr));
    }
    static int maxWealth(int[][] nums){
        int max = Integer.MIN_VALUE;

        for (int[] r : nums) {
            int sum = 0;
            for (int c : r) {
                sum += c;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
