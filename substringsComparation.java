import java.util.Scanner;

public class substringsComparation {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.SortedSet<String> sets = new java.util.TreeSet<String>();
        for (int i = 0; i <= s.length() - k; i++) { // lenght sirve para obtener la longitud de la cadena
            sets.add(s.substring(i, i + k));  // se obtiene la subcadena mediante el metodo substring que recibe dos parametros, el primero es el indice de inicio y el segundo es el indice de fin
        }
        smallest = sets.first();
        largest = sets.last();
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}