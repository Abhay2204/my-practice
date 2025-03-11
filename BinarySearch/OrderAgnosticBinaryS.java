package BinarySearch;

public class OrderAgnosticBinaryS {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9,12,16,19,22,27,30,42,56,68,89};
        int target = 22;
        int ans = OrderAgnosticBinaryS(arr, target);
        System.out.println(ans);
    }
    static int OrderAgnosticBinaryS (int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        //finf asc or desc
        boolean isasc = (arr[start] < arr[end] );


        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if( isasc) {
            if (target < arr[mid]){
                end  = mid - 1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }
            else {
                return mid;
            }}
            else {
                if (target > arr[mid]  ){

                    end= mid -1;
                }
                if (target < arr[mid]){
                    start = mid +1;
                }
                else{ return mid ;}
            }
        }
        return -1;
    }


    }
