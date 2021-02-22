import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Enter 3 numbers:");
		
		for (int i=0; i<3; i++) {
			numbers.add(in.nextInt());
		}
		
		in.close();
		
		StringBuffer sb = new StringBuffer();
		
		for (Integer num : numbers) {
			sb.append(num.toString());
		}
		
		String result = sb.toString();
		
		System.out.printf("Result number is %s.", result);
	}
}