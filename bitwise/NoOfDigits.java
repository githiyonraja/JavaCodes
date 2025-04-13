package bitwise;

public class NoOfDigits{
    public static void main(String[] args) {
        int n = 354;
        int b = 10;
        System.out.println(noOfDigits(n,b));
            }
        
            private static int noOfDigits(int n, int b) {                
                return (int) (Math.log10(n)) + 1;
            }
}