package recursion;

public class PyaramidPattern {
    public static void main(String[] args) {
        int n = 5;
        pyramidPattern(1, n);
    }

    static void pyramidPattern(int start, int rows){
        if(start > rows) return;

        printSpaces(rows - start);
        printStars(2 * start - 1);
        System.out.println();
        pyramidPattern(start + 1,rows);
    }

    static void printStars(int count){
        if(count == 0) return;

        System.out.print("*");
        printStars(count - 1);
    }

    static void printSpaces(int count){
        if(count == 0) return;

        System.out.print(" ");
        printSpaces(count - 1);
    }
}
