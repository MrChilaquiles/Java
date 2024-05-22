import java.util.*;

public class stringsIntroduction {
    public static void main(String[] args) {
        String A , B;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextLine();
        B = scanner.nextLine();
        System.out.println(A.length() + B.length()); // length() returns the length of the string.
        if (A.compareTo(B) > 0) { // compareTo() returns 0 if the strings are equal, a positive value if the first string is greater, and a negative value if the second string is greater.
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1)); // substring() returns a part of the string, starting from the specified index.
    }
}