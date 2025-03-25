package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        selection(arr,0,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int start, int end, int max){
        if(end == 0){
            return;
        }
        if(end>start){
            if(arr[start] > arr[max]){
                selection(arr,start+1,end,start);
            }else{
                selection(arr,start+1,end, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[end-1];
            arr[end-1] = temp;
            selection(arr,0, end-1,0);
        }
    }
}
