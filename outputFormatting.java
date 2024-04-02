import java.util.Scanner;

public class outputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x); // %-15s: left-justified string, 15 characters wide. %03d: 3-digit integer (leading zeroes).
        }
        System.out.println("================================");
    }
}