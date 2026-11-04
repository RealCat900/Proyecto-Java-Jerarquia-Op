import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de dos cifras (10-99): ");
        int n = sc.nextInt();
        int decenas = (n / 10);
        int unidades = (n % 10);
        boolean iguales = (decenas == unidades);
        System.out.println("Decenas: " + decenas + ", Unidades: " + unidades);
        System.out.println("Digitos iguales: " + iguales);
        sc.close();
    }
}
