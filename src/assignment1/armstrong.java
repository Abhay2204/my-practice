package assignment1;

public class armstrong {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {

            int a = i;
            int temp = a;
            int sum = 0;
            while (a > 0) {
                int mod = a % 10;
                sum = (int) (sum + Math.pow(mod, 3));
                a = a / 10;
            }
            if (temp == sum) {
                System.out.println("yes" + i);
            } else {
//                System.out.println("no");
            }
        }
    }


}




