package recursion;

public class PrintNNumbers {
    public static void main(String[] args) {
        PrintNNumbers n1 = new PrintNNumbers();
        n1.printNto1(10);
        System.out.println();
        n1.print1toN(10);
        System.out.println();
        n1.printboth(10);
    }

    public void printNto1(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        printNto1(n-1);
    }

    public void print1toN(int n){
        if(n == 0){
            return;
        }
        print1toN(n-1);
        System.out.print(n);
    }

    public void printboth(int n){
        if(n == 0){
            System.out.println();
            return;
        }
        System.out.print(n);
        printboth(n-1);
        System.out.print(n);
    }
}
