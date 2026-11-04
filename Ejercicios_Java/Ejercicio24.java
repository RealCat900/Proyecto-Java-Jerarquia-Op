import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero n: ");
        int n = sc.nextInt();
        boolean enRango = (((n >= 1) && (n <= 10)) || ((n >= 50) && (n <= 60)));
        System.out.println("Esta en [1,10] o [50,60]: " + enRango);
        sc.close();
    }
}
