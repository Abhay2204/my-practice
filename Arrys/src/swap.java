import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,9,3,4};
//        swap (arr,1,4);
        reverse (arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <arr.length-1){
            //swap
        swap(arr,start,end);
        start ++;
        end --;

        }
    }
    static void swap(int[] arr,int index1,int index2){
        int  temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]= temp;
    }
}
