import java.util.ArrayList;
import java.util.Scanner;

public class task8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 2; i++) {
			System.out.printf("Enter %s number of range: ", (i == 0 ? "min" : "max"));
			numbers.add(in.nextInt());
		}
		
		in.close();
		
		for (int i = Math.min(numbers.get(0), numbers.get(1)); i <= Math.max(numbers.get(0), numbers.get(1)); i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
			System.out.println("************************");
		}
	}
}
