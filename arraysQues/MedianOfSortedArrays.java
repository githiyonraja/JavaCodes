package arraysQues;

import java.util.Arrays;

public class MedianOfSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        int[] mergeResult = merge(nums1, nums2);
        System.out.println(median(mergeResult));

    }

    static int[] merge(int[] nums1, int[] nums2){
        int[] ans = new int[nums1.length+ nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                ans[k] = nums1[i];
                i++;
            }else{
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < nums1.length){
            ans[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length){
            ans[k] = nums2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    static double median(int[] arr){
        double median;

        int start = 0;
        int end = arr.length - 1;

        int mid = (end - start)/2;

        if(arr.length % 2 == 0){
            median = (double) (arr[mid] + arr[mid+1] )/ 2;
        }else{
            median = arr[mid];
        }

        return median;
    }
}
