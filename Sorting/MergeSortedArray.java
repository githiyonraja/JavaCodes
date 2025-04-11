package Sorting;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,5,6};
        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));
    }

    static int[] mergeArrays(int[] nums1, int[] nums2){
        int[] mix = new int[nums1.length+nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i]<nums2[j]){
                mix[k] = nums1[i];
                i++;
            }else{
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < nums1.length){
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length){
            mix[k] = nums2[j];
            j++;
            k++;
        }

        return mix;
    }
}
