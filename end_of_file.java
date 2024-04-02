import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class end_of_file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linecounter = 1;
        while (scanner.hasNext()) { // hasNext() returns true if there is another line of input
            String line = scanner.nextLine();
            System.out.println(linecounter + " " + line);
            linecounter++;
        }
    }
}