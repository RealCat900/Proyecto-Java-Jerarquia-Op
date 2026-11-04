import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor entero: ");
        int n = sc.nextInt();
        boolean terminaCero = ((n % 10) == 0);
        System.out.println("Termina en cero: " + terminaCero);
        sc.close();
    }
}
