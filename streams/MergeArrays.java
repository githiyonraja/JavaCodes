package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeArrays {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> l2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> l3 = Stream.concat(l1.stream(),l2.stream())
                .sorted()
                .toList();

        System.out.println(l3);
    }
}
