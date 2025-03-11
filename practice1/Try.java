package practice1;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter two numbers");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        int sum = a+b;
        System.out.println("sum is " + sum);

    }
}
