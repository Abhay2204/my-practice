package LINEARARCH;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
//        int[] arr={12,34,5,6,77,74,32,56,44};
//        int target =6;
        Scanner in= new Scanner(System.in);

        System.out.println("enter the numbers of arrye");
        int n =in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr [i] = Integer.parseInt(in.next());
        }
        System.out.println("enter  the  target");
        int target = in. nextInt();
        boolean ans= linearsearch3(arr,target);
        System.out.println(ans);
    }
    // search for he target and return true false
    static boolean linearsearch3 (int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        //run a for loop
        for (int element : arr) {
            //check every element ay every index it it is = target
            if (element == target) {
                return true;
            }
        }
        //if no target is found
        return false;
    }


    //seach the target and return the element
    //search in the arry return the index if item found
    static int linearsearch2 (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop
        for (int element : arr) {
            //check every element ay every index it it is = target
            if (element == target) {
                return element;
            }
        }
        //if no target is found
        return Integer.MAX_VALUE;
//    search in the arry return the index if item found
//    static int linearsearch (int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        //run a for loop
//        for (int index = 0; index < arr.length; index++) {
//            //check every element ay every index it it is = target
//            int element= arr[index];
//            if(element==target){
//                return  index;
//            }
//        }
//        //if no target is found
//            return -1;
    }
}
