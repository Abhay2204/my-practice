package assignment1;

import java.util.Scanner;

public class larger_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if ( num1>num2) {
            System.out.println("the larger number is " + num1);

            }
        if(num1<num2) {
            System.out.println("the larger number is " + num2);
        } else if (num1==num2) {
                System.out.println( "both are equal");
            }
            else  {
                System.out.println("enter a valid number");
        }


        }
    }
