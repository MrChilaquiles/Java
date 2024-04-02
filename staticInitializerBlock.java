import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class staticInitializerBlock {
    static Scanner scanner = new Scanner(System.in);
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    static boolean flag = true; // flag to check if B and H are positive
    static { // static initializer block
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        if(flag){ // if flag is true, print the area
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}//end of class