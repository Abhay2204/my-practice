import java.util.Arrays;

public class Passinginfunction {
    public static void main(String[] args) {
        int[] nums ={2,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int [] arr){
        arr[1] = 34;

    }

}
