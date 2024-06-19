import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String aReverse;
        aReverse = new StringBuilder(A).reverse().toString(); //StringBuilder is a mutable sequence of characters and is more efficient than String for concatenating multiple strings
        if (A.equals(aReverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
