import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero: ");
        int n = sc.nextInt();
        boolean multiplo = (((n % 4) == 0) && ((n % 6) == 0));
        System.out.println("Multiplo simultaneo de 4 y 6: " + multiplo);
        sc.close();
    }
}
