package condional.loops;

import java.util.Scanner;

public class classcheck {
    public static void main(String[] args) {
        Scanner ch =new Scanner(System.in);
        char al = ch.next().trim().charAt(0);
        if (al >= 'a' & al <= 'z'){
            System.out.println("Lowercase");

        }
        else{
            System.out.println("uppercase");
        }
    }
}
