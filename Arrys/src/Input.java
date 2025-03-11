package Arrys ;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //arrray of primitives
//        int [] arr = new int[5];
//        arr[0] = 20;
//        arr[1] = 10;
//        arr[2] = 50;
//        arr[3] = 330;
//        arr[4] = 4130;
//        System.out.println(arr[4]);


        // using for loop
//        for (int i = 0; i < 5; i++) {
//            arr [i] = in.nextInt();
//
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int num : arr ){ //to print alll arrays at once
//            System.out.println(num);// here num represent elements of array
//
//        }
//        System.out.println(Arrays.toString(arr));

//        array of object
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str [i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
