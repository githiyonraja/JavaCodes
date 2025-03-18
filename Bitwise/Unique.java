package Bitwise;

public class Unique {
    public static void main(String[] args) {
        int[] arr = {2,3,6,4,3,4,2};
        System.out.println(unique(arr));
        
            }
        
            private static int unique(int[] arr) {
                int ans = 0;
                for (int i : arr) {
                    ans ^= i;
                }
                return ans;
            }
}
