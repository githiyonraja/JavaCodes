package sorting;

import java.util.Arrays;

public class MergeSortedArrayInPlace {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0,0};
        int[] arr2 = {0,1,3,6,};
        mergeSortedArrayInPlace(arr1, 3, arr2, 4);
    }

    static void mergeSortedArrayInPlace(int[] arr1, int m, int[] arr2, int n){
        if(n == 0){
            return;
        }
        int endIndex = arr1.length - 1;

        while(m > 0 && n > 0){
            if(arr1[m-1] >= arr2[n-1]){
                arr1[endIndex] = arr1[m-1];
                m--;
            }else{
                arr1[endIndex] = arr2[n-1];
                n--;
            }
            endIndex--;
        }
        while(n > 0){
            arr1[endIndex] = arr2[n-1];
            n--;
            endIndex--;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
