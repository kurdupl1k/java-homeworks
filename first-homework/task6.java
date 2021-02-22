import java.util.Scanner;

public class task6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = 0;
		
		while (number <= 0) {
			System.out.print("Enter number of metres: ");
			number = in.nextInt();
			
			if (number <= 0) {
				System.out.println("Your number isn't positive!");
			}
			else {
				System.out.print("Choose operation (miles - 1, inches - 2, yards - 3): ");
				switch (in.nextInt() - 1) {
				case 0:
					System.out.printf("%d metres to miles is %f.", number, (number / 1.609344));
					break;
				case 1:
					System.out.printf("%d metres to inches is %f.", number, (number * 39.3700787));
					break;
				case 2:
					System.out.printf("%d metres to yards is %f.", number, (number * 1.0936133));
				default:
					break;
				}
			}
		}
		
		in.close();
	}
}
