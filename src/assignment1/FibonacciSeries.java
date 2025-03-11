package assignment1;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int i = 0;
        int firstno =0;
        int secondno = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("enter number of terms");
        int n = input.nextInt();

        while (i < n){
            System.out.println(firstno + ", ");
            int nextnum = firstno + secondno;
            firstno = secondno;
            secondno = nextnum;
            i++;
        }




    }
}
