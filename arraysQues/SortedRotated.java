package arrays;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SortedRotated {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        //System.out.println(check(nums));
        System.out.println(search(nums,1));
    }
    //Bruteforce approach
    public boolean check(int[] nums) {
        int  count = 0;
        int n = nums.length;

        if(nums[0] < nums[n-1]) count ++;

        for(int i = 0 ; i<n-1; i++){
            if(nums[i] > nums[i+1]){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
//Binary Search Approach
    //finding Pivot
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                System.out.println("Pivot: "+arr[mid]);
                return mid;
            }else if(mid > start && arr[mid] < arr[mid-1]){
                System.out.println("Pivot: "+arr[mid-1]);
                return mid-1;
            }
            if(arr[mid] >= arr[start]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    //Search
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
    return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    //BinarySearch
    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
