package assignment1;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        String reverse = "";
        for (int i = len-1; i >=0; i--) {

            reverse = reverse + str.charAt(i);
        }
        System.out.println("the reverse string is "+ reverse);

    }
}
