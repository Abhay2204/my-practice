package Question;


public class Armstrong_fun {
    public static void main(String[] args) {
        for (int n = 100; n <1000 ; n++)
            if (isarmstrong(n)) {
                System.out.println(n);
            }

    }

     static boolean isarmstrong(int n) {
        int org = n;
        int sum  = 0;

        while (n > 0){
            int rem = n %10;
            n = n/10;
            sum = sum + (rem * rem * rem);

        }
        return sum==org;
    }


}
