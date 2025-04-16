package streams;

import java.util.Arrays;

public class SmallestElementInArray {
    public static void main(String[] args) {
        //kth smallest number
        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 3;

        int kthSmall = Arrays.stream(array)
                .sorted()
                .skip(k - 1)
                .findFirst()
                .orElse(-1);

        System.out.println(kthSmall);
    }
}
