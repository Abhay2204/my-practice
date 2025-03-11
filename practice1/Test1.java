package practice1;

public class Test1 {
    public static void main(String[] args) {
        int i, j, arr[] = {34, 12, 36, 11, 45, 23};
        int temp;
        for (i = 0; i <6; i++) {
            for (j = 1; j <6; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
            System.out.println(arr[i]);

        }

    }
}
