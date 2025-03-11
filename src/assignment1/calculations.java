package assignment1;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner input1;
        input1 = new Scanner(System.in);
        System.out.println(" enter first number ");
        int num1 = input1.nextInt();

        Scanner input2;
        input2 = new Scanner(System.in);
        System.out.println(" enter second number ");
        int num2 = input2.nextInt();

        Scanner operation;
        operation = new Scanner(System.in);
        System.out.println(" enter the operation i.e +,-,*,/,%  ");
        char op = operation.next().charAt(0);

        int ans = 0;

        if ( op=='+') {
            ans = num1 + num2;
        }
            if ( op=='-') {
                ans = num1 - num2;
            }
            if (op =='*') {
                ans = num1 * num2;
            }
            if (op=='/') {
                ans = num1 / num2;
            }
            if ( op=='%') {
                            ans = num1 % num2;
                        }
            else {
                System.out.println("enter a valid operation");
                        }
                        System.out.println("your ans is :"+ ans);

            }
        }



