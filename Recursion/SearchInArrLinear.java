package Recursion;

import java.util.ArrayList;

public class SearchInArrLinear {
    public static void main(String[] args) {
        int[] arr = {1,4,5,9,9,12,16};
//        System.out.println(findElem(arr,12,0));
//        System.out.println(findElemIndex(arr,12,0));
//        System.out.println(findElemList(arr,9,0,new ArrayList<Integer>()));
//        System.out.println(findElemFromLastIndex(arr,5,arr.length-1));
        System.out.println(findElemListWithoutArg(arr,9,0));
    }

    static boolean findElem(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || findElem(arr,target,index+1);
    }

    static int findElemIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findElemIndex(arr,target,index+1);
    }

    static int findElemFromLastIndex(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findElemFromLastIndex(arr, target, index - 1);
    }

    static ArrayList<Integer> findElemList(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findElemList(arr,target,index+1,list);
    }
    static ArrayList<Integer> findElemListWithoutArg(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow = findElemListWithoutArg(arr,target,index + 1);

        list.addAll(ansFromBelow);
        return list;


    }
}
