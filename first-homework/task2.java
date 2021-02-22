import java.util.Scanner;
public class task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = in.nextInt();
		
		System.out.print("Enter a percent: ");
		int percent = in.nextInt();
		
		in.close();
		
		System.out.printf("Result: %d", number / percent);
	}
}
