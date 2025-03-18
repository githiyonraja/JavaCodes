package Bitwise;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 8;
        if((n & 1) == 1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
}
