package recursion;

public class RightAlignedTriPattern {
    public static void main(String[] args) {
        int n = 5;
        pattern6(1,5);
    }

    static void pattern6(int r, int n){
        if(r > n) return;
        printSpaces(n-r);
        printStars(r);
        System.out.println();
        pattern6(r+1,n);
    }

    static void printSpaces(int count){
        if(count == 0){
            return;
        }
        System.out.print(" ");
        printSpaces(count - 1);
    }
    static void printStars(int count){
        if(count == 0){
            return;
        }
        System.out.print("*");
        printStars(count - 1);
    }

}
