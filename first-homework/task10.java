import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.function.Predicate;

public class task10 {
    public static ArrayList<Integer> choose(ArrayList<Integer> list, Predicate<Integer> p) {
        ArrayList<Integer> ret = new ArrayList<Integer>();

        for (Integer i : list) {
            if (p.test(i)) ret.add(i);
        }

        return ret;
    }

    public static void print_list(ArrayList<Integer> list, String str) {
        System.out.print(str);

        for (Integer i : list) {
            System.out.printf("%d ", i);
        }

        System.out.println();
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt() % 100);
        }

        print_list(list, "List: ");
        print_list(choose(list, param -> { return param % 2 == 0; }), "Sublist of even numbers: ");
        print_list(choose(list, param -> { return param % 2 == 1; }), "Sublist of odd numbers: ");
        print_list(choose(list, param -> { return param < 0; }), "Sublist of negative numbers: ");
        print_list(choose(list, param -> { return param > 0; }), "Sublist of positive numbers: ");
    }
}
