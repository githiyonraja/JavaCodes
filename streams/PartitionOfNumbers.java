package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n%2 == 0));

        List<Integer> even = partitionedNumbers.get(true);
        List<Integer> odd = partitionedNumbers.get(false);

        System.out.println(even);
        System.out.println(odd);
        System.out.println(partitionedNumbers);

    }
}
