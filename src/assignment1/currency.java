package assignment1;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your currency in rupees");
        int r = input.nextInt();
        float usd = r/82.72f;
        System.out.println(" your currency in usd is :" +usd);

    }
}
