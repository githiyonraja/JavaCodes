package bitwise;

public class DoubleIt {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(doubleIt(n));
            }
        
            private static int doubleIt(int n) {
                return (n << 1);
            }
}
