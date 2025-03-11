package assignment1;

import java.util.Scanner;

public class Sumallnum {
    public static void main(String[] args) {
        Scanner im = new Scanner(System.in);
        int sum=0,b;
        System.out.println("enter the number of numbers to be added");
        int n= im.nextInt();
        System.out.println("enter the numbers");
        for (int i = 0; i < n; i++) {

            b= im.nextInt();
            sum = sum + b;
        }
        System.out.println("the ans is " + sum);
    }
}
