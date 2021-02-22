import java.util.Random;
import java.util.ArrayList;

public class task9 {
    public static Integer min(ArrayList<Integer> list) {
        Integer min = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (min < list.get(i)) {
                min = list.get(i);
            }
        }

        return min;
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (max > list.get(i)) {
                max = list.get(i);
            }
        }

        return max;
    }

    public static Integer count_negative(ArrayList<Integer> list) {
        int count = 0;

        for (Integer i : list) {
            if (i < 0) count++;
        }

        return count;
    }

    public static Integer count_positive(ArrayList<Integer> list) {
        int count = 0;

        for (Integer i : list) {
            if (i > 0) count++;
        }

        return count;
    }

    public static Integer count_zeros(ArrayList<Integer> list) {
        int count = 0;

        for (Integer i : list) {
            if (i == 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            list.add(random.nextInt() % 5000);

        System.out.print("Random list: ");
        for (Integer i : list) {
            System.out.printf("%d ", i);
        }

        System.out.printf("\nMinimal value in list: %d\n", min(list));
        System.out.printf("Maximal value in list: %d\n", max(list));
        System.out.printf("Count of negative numbers: %d\n", count_negative(list));
        System.out.printf("Count of positive numbers: %d\n", count_positive(list));
        System.out.printf("Count of zeros: %d\n", count_zeros(list));
    }
}
