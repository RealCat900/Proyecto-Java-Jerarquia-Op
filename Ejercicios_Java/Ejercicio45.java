import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de tres cifras: ");
        int n = sc.nextInt();
        int centenas = (n / 100);
        int decenas = ((n / 10) % 10);
        int unidades = (n % 10);
        int suma = (centenas + decenas + unidades);
        System.out.println("Suma de digitos: " + suma);
        sc.close();
    }
}
