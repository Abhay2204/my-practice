package conditional.loops;

import java.util.Scanner;

public class larghest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        // largest of three no.
      /*int max = a;
        if (a < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }*/
        int max = Math.max(Math.max(a,b),c);
        System.out.println(max);
    }

}
