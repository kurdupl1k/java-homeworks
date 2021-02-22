import java.util.Scanner;
public class task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter six digits number: ");
		Integer number = in.nextInt();
		
		in.close();
		
		if (number < 100000 && number > 999999) {
			System.out.println("Your number isn't six digits!");
		}
		else {
			StringBuffer sb = new StringBuffer(number.toString());
			sb.reverse();
			
			StringBuffer substr = new StringBuffer(sb.substring(2, 4));
			substr.reverse();
			
			sb.delete(2, 4);
			sb.insert(2, substr);
			
			System.out.printf("Result: %s", new String(sb));
		}
	}
}
