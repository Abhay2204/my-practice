package assignment1;

import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner input1;
        input1 = new Scanner(System.in);
        System.out.println("enter principle");
        int p = input1.nextInt();

        Scanner input2;
        input2 = new Scanner(System.in);
        System.out.println("enter time span");
        int t = input2.nextInt();

        Scanner input3;
        input3 = new Scanner(System.in);
        System.out.println("enter rate of intrest");
        float r = input3.nextFloat();

        float si =( p * r * t) / 100;
        System.out.println("simple intrest is " + si);
    }
}
