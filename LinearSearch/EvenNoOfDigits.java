package LinearSearch;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896,67};
        System.out.println(findNumber(arr));
    }
    static int findNumber(int[] arr){
        int count = 0;
        for(int n : arr){
            if(even(n)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = noOfDigits2(num);
        return numberOfDigits % 2 == 0;
    }
    static int noOfDigits(int n){
        int count = 0;
        if(n == 0) return 1;
        if(n < 0){
            n *= -1;
        }
        while(n>0){
            count++;
            n /= 10;
        }
        return count;
    }
    static int noOfDigits2(int n){
        return (int) Math.log10(n) + 1;
    }
}
