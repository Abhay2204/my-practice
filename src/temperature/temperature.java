package temperature;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter temperature in c ");
        float tempc = input.nextFloat();
        float tempf = (tempc * 9/5 ) + 32 ;
        System.out.println(tempf);


    }
}
