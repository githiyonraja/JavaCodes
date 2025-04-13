package recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int end, int start){
        if(end == 0){
            return;
        }
        if(end>start){
            if(arr[start] > arr[start+1]){
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;
            }
            bubble(arr,end,start+1);
        }
        else{
            bubble(arr,end-1,0);
        }
    }
}
