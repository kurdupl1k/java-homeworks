import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter month number: ");
		int number = in.nextInt();

		in.close();

		switch (number - 1) {
		case 0:
		case 1:
		case 2:
			System.out.println("Winter!");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Spring!");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer!");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Autumn!");
			break;
		default:
			System.out.println("Your number isn't a number of month! Enter (1..12).");
			break;
		}

		// 0 1 2 3 4 5 6 7 8 9 10 11
	}
}
