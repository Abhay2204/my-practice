package basic_loops;

import java.util.Scanner;

public class countnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Float count = 55.64f;
        while(n>0) {
            int rem = n % 10;
            if (rem == 5){
                count ++;
            }
            n = n/10;
        }
        System.out.println(count);
    }

}
