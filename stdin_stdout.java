import java.util.*;
public class stdin_stdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int myInt  = scan.nextInt();
        int myInt2  = scan.nextInt();
        int myInt3  = scan.nextInt();
        scan.close();
        System.out.println(myInt + "\n" + myInt2 + "\n"  + myInt3);
    }
}