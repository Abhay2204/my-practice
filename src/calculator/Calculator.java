package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // take input from user until user press x or X
          int ans = 0;
          while(true){
              // taking a operator as input
              System.out.println("enter the operator");
              char op = in.next().trim().charAt(0);
              System.out.println();
              if(op =='+' ||op =='*' ||op =='-' ||op =='/' ||op =='%' ){
                  System.out.print("enter two numbers");
                  int num1= in.nextInt();
                  int num2= in.nextInt();
                  if (op == '+'){
                      ans = num1 + num2;
                  }
                  if (op == '-'){
                      ans = num1 - num2;
                  }
                  if (op == '*'){
                      ans = num1 * num2;
                  }
                  if (op == '/'){
                      if (num2 !='0'){
                      ans = num1 / num2;
                      }
                  }
                  if (op == '%'){
                      ans = num1 % num2;
                  }


              }
              else if(op =='X'|| op == 'x'){
                  break;

              }
              else {
                  System.out.println("invalid operation");
              }

              System.out.println(ans);

          }
    }
}
