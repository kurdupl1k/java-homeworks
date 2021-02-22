import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class task12 {
    public static void print_list(ArrayList<Integer> list, String str) {
        System.out.print(str);

        for (Integer i : list) {
            System.out.printf("%d ", i);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt() % 100);
        }

        print_list(list, "List before sorting: ");

        System.out.print("In which order do you want to sort array (0 - ascending," +
                " 1 - descending): ");
        int order = in.nextInt();

        if (order != 0 && order != 1) {
            System.out.println("Incorrect order!");
        }
        else {
            Collections.sort(list);
            if (order == 1) {
                Collections.reverse(list);
            }

            print_list(list, "List after sorting: ");
        }

        in.close();
    }
}
