package sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInplace(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }
        int mid = (start + end)/2;

        mergeSortInplace(arr,start,mid);
        mergeSortInplace(arr,mid,end);

        merge(arr,start,mid,end);
    }
    static void merge(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];
        int a = s;
        int b = m;
        int k = 0;

        while(a<m && b<e){
            if(arr[a] < arr[b]){
                mix[k] = arr[a];
                a++;
            }else{
                mix[k] = arr[b];
                b++;
            }
            k++;
        }
        while(a<m){
            mix[k] = arr[a];
            a++;
            k++;
        }
        while(b<e){
            mix[k] = arr[b];
            b++;
            k++;
        }
        for (int i = 0; i < mix.length; i++) {
            arr[s+i] = mix[i];
        }
    }
}
