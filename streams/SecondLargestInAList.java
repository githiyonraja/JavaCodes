package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestInAList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < 15 ; i = i+2){
            list.add(i);
        }
        System.out.println(list);

        Optional<Integer> sL1 = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(sL1.get());

        Optional<Integer> sL2= list.stream()
                .distinct()
                .sorted((a,b)->(b-a))
                .skip(1)
                .findFirst();
        System.out.println(sL2.get());
    }
}
