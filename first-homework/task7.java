import java.util.Scanner;
import java.util.ArrayList;

public class task7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 2; i++) {
			System.out.printf("Enter %s number of range: ", (i == 0 ? "min" : "max"));
			numbers.add(in.nextInt());
		}
		
		in.close();
		
		for (int i = Math.min(numbers.get(0), numbers.get(1)); i < Math.max(numbers.get(0), numbers.get(1)); i++) {
			if (i % 2 != 0) {
				System.out.printf("%d ", i);
			}
		}
	}
}
