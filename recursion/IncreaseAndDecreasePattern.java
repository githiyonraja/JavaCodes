package recursion;

public class IncreaseAndDecreasePattern {
    public static void main(String[] args) {
        int n = 5;
        increasingPattern5(1,n);
        decreasingPattern5(n - 1);
    }

    static void increasingPattern5(int start, int max){
        if(start>max){
            return;
        }
        printPattern5(start);
        increasingPattern5(start+1,max);
    }

    static void decreasingPattern5(int start){
        if(start == 0){
            return;
        }

        printPattern5(start);
        decreasingPattern5(start-1);
    }

    static void printPattern5(int count){
        if(count == 0){
            System.out.println();
            return;
        }
        System.out.print(" * ");
        printPattern5(count - 1);
    }
}
