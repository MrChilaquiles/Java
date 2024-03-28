import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Este es un programa para probar Java y su debugger.");
        System.out.println("Dame un valor entero: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.println("El valor que ingresaste es: " + num);
    }
}