import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero: ");
        int n = sc.nextInt();
        boolean multiplo3 = ((n % 3) == 0);
        System.out.println("Divisible exactamente entre 3: " + multiplo3);
        sc.close();
    }
}
