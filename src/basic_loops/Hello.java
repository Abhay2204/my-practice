package basic_loops;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner n = new Scanner(System.in);

        int a = n.nextInt();

        int b = n.nextInt();

        int c = a+b;
        int d = a-b;
        System.out.println(c);
    }
}
