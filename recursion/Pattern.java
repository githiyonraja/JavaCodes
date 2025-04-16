package recursion;

public class Pattern {
    public static void main(String[] args) {
        pattern4rec(5,0);

    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern1Rec(int r, int c){
        if(r==0){
            return;
        }
        int temp = c;
        while (temp <= c && temp!=0) {
            System.out.print(" * ");
            temp--;
        }
        System.out.println();
        pattern1Rec(r-1,c);
    }

    static void pattern2rec(int r, int c){
        if(r == 0){
            return;
        }
        if(r > c){
            pattern2rec(r,c+1);
            System.out.print(" * ");
        }else{
            pattern2rec(r-1,0);
            System.out.println();
        }
    }

    static void pattern4rec(int r, int c){
        if(c > r){
            return;
        }
        printpatter4(1,c);
        System.out.println();
        pattern4rec(r,c+1);
    }

    static void printpatter4(int start, int limit) {
        if(start > limit){
            return;
        }
        System.out.print(start+" ");
        printpatter4(start+1,limit);
    }
}
