import java.util.ArrayList;
import java.util.Scanner;

public class Arrylistexample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);

//        list.add(34);
//        list.add(4);
//        list.add(3);
//        list.add(34);
//        list.add(35);
//        list.add(67);
//
//        list.remove(2)
//        list.set(4,78);
//
//        System.out.println(list.contains(3));
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add((in.nextInt()));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here ;\,list[index] syntax will not work here
        }
        System.out.println(list);



    }
}
