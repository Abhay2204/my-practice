package atm;

import java.sql.SQLOutput;
import java.util.Scanner;


public class ATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("welcome to atm");
        System.out.println("Enter 1 to check balence \n Enter 2 to deposit money \n Enter 3 to withdraw money \n ");
        int c = in.nextInt();
        System.out.println("enter your pin");
        int p = in.nextInt();
        int b = 10000;
        if(p == 1234){
            int b1 = b;
            switch (c)
            {
                case 1 :
                    System.out.println(b1);
                    break;

                case 2 :
                    System.out.println("enter amount to deposit");
                    int d = in.nextInt();
                    b1 += d;
                    System.out.println("the current balence is "+b1);
                    break;


                case 3 :                    System.out.println("enter amount to withdraw");
                    int w = in.nextInt();
                    b1 -= w;
                    System.out.println("the current balence is "+b1);
                    break;

                default:
                    System.out.println("invalid operation");


            }

        }
        else {
            System.out.println("invalid pin");
        }
        System.out.println("thankyou for using our service");


    }
}
