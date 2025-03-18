import java.util.Arrays;

public class ArraySwapReverse {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 5, 8, 10, 3, 66, 99 };
        //swap(arr, 2, 5);
        reverse(arr, 0, arr.length-1);
        System.out.println(maxV(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int[] swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }

    static int maxV(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int[] reverse(int[] arr, int start, int end){
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }
}
