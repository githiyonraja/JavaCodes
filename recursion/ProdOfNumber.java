package recursion;

public class ProdOfNumber {
    public static void main(String[] args) {
        System.out.println(prodOfN(12045));
    }

    static int prodOfN(int n){
        if(n%10 == n){
            return n;
        }
        return n%10 * prodOfN(n/10);
    }
}
