package BinarySearch;

public class Binarysearch1 {
    public static void main(String[] args) {
        int[] arr = {67,34,23,12,9,8,6,5,4};
        int target = 5;
        int ans = binarysearch(arr , target);
        System.out.println(ans);
    }
    static int binarysearch(int [] arr,int target){
        int start =0;
        int end = arr.length -1;

        while( start <= end  ){
            int mid = start + (end-start)/2;
            if (target > arr[mid]  ){

                end= mid -1;
            }
            if (target < arr[mid]){
                start = mid +1;
            }
            else{ return mid ;}
        }
        return -1;
    }
}
