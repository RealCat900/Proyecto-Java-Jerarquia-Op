import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero positivo: ");
        int n = sc.nextInt();
        boolean noTerminaCero = !((n % 10) == 0);
        System.out.println("NO termina en cero: " + noTerminaCero);
        sc.close();
    }
}
