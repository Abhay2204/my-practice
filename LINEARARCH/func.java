package LINEARARCH;

import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        int a = 12;
        int b = 16;
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();

        int ans = 0;

        if (c == 1){
            ans = a+b;
        }
        else if(c == 2){
            ans = a-b;
        }
        else if(c == 3){
            ans = a*b;
        }
        else if (c ==4){
            ans = a/b;
        }
        else{
            System.out.println("wrong input");
        }
        System.out.println(ans);
    }
}
