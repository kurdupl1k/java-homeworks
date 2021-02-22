import java.util.Scanner;

public class task11 {
    public static void draw_line(char symbol, int length, boolean direction) {
        for (int i = 0; i < length; i++) {
            System.out.printf(direction ? "%c\n" : "%c", symbol);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a symbol which would be used in line: ");
        char symbol = in.next().charAt(0);

        System.out.print("Enter length of the line: ");
        int length = in.nextInt();

        boolean string_success = false;
        while (!string_success) {
            System.out.print("Enter, should your string be vertical or horizontal: ");
            String dir = in.next();

            System.out.println(dir);

            if (!dir.equals("horizontal") && !dir.equals("vertical")) string_success = false;
            else {
                string_success = true;
                draw_line(symbol, length, dir.equals("horizontal") ? false : true);
            }
        }

        in.close();
    }
}
