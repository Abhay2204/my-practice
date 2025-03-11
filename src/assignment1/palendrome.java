package assignment1;

import java.util.Scanner;

public class palendrome {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str = input.nextLine();

        int length = str.length();
        String rev = "";
        for(int i=length - 1;i>=0;i--) {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println(str +" is a palendrome");
        }
        else {
            System.out.println(str +" is not a palendrome");
        }


    }
}
