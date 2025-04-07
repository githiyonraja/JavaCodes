package BinarySearch;

public class Binary2DSortedInRC {
    public static void main(String[] args) {
        int[][] matrix = {
                {-1,-1}
        };
        int target = -2;
        Binary2DSortedInRC bs = new Binary2DSortedInRC();
        System.out.println(bs.search(matrix,target));
    }
    public boolean search(int[][]arr,int target){
        int r = 0;
        int c = arr.length-1;

        if(arr.length == 1){
            int start = 0;
            int end = arr[0].length - 1;

            while(start <= end){
                int mid = start + (end - start)/ 2;

                if(arr[0][mid] == target){
                    return true;
                }else if(arr[0][mid] > target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            return false;
        }

        while(r < arr.length && c >= 0){
            if(arr[r][c] == target){
                return true;
            }if(arr[r][c] < target){
                r++;
            }else{
                c--;
            }
        }

        return false;
    }
}
