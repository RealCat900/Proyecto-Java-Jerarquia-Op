import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero: ");
        int n = sc.nextInt();
        boolean imparNegativo = ((n < 0) && ((n % 2) != 0));
        System.out.println("Es impar negativo: " + imparNegativo);
        sc.close();
    }
}
