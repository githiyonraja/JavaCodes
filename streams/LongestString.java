package streams;

import java.util.*;

public class LongestString {
    public static void main(String[] args) {
        List<String> strlist = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");

        Optional<String> longStr = strlist.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longStr.get());
    }
}
