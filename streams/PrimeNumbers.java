package streams;

import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 6, 8, 10, 12, 14, 15);
        boolean containsPrime = list.stream()
                .anyMatch(PrimeNumbers :: isPrime);
        System.out.println(containsPrime);
    }

    static boolean isPrime(int number){
        if(number <= 1) return false;

        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
