package recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
//        powertwo(16);
        System.out.println(powertwo(22));
    }

    static boolean powertwo(int n){
        if (n == 1) return true;

        return n > 1 && ((n & n-1) == 0);
    }
}
