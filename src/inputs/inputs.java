package inputs;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input some value: ");
        // for int
//        int rollno = input.nextInt();
//        System.out.println("your roll number is " + rollno);

        //for name
//        String name = input.next();
//        System.out.println("your name is " + name);

        //for float
        float percentage = input.nextFloat();
        System.out.println("your percentage is "+ percentage);




    }
}