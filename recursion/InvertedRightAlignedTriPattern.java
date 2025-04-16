package recursion;

public class InvertedRightAlignedTriPattern {
    public static void main(String[] args) {
        int n = 5;
        pattern7(1,5);
    }
    static void pattern7(int r, int n){
        if(r > n){
            return;
        }
        pattern7(r+1, n);
        printSpaces(n-r);
        printStars(r);

        System.out.println();
    }
    static void printSpaces(int count){
        if(count == 0){
            return;
        }
        System.out.print(" ");
        printSpaces(count - 1);
    }

    static void printStars(int count){
        if (count == 0){
            return;
        }
        System.out.print("*");
        printStars(count - 1);
    }
}
