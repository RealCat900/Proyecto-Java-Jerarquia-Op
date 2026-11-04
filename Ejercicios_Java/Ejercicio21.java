import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor decimal x: ");
        double x = sc.nextDouble();
        boolean enRango = ((x > 15) && (x < 85));
        System.out.println("Esta estrictamente en (15, 85): " + enRango);
        sc.close();
    }
}
