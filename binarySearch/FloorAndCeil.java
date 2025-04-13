package binarySearch;

import java.util.Arrays;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int n = 6, x = 5;
        int[] ans = getFloorAndCeil(arr,n,x);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getFloorAndCeil(int[] arr, int n, int x){
        int f = findFloor(arr,n,x);
        int c = findCeil(arr,n,x);
        return new int[]{f,c};
    }
    static int findFloor(int[] arr,int n, int x){
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] <= x){
                ans = arr[mid];
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    static int findCeil(int[] arr, int n , int x){
        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start) / 2;

            if(arr[mid] >= x) {
                ans = arr[mid];
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
