import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor inicial de la maquinaria: "); double inicial = sc.nextDouble();
        System.out.print("Valor de rescate: "); double rescate = sc.nextDouble();
        System.out.print("Anios de vida util: "); int anios = sc.nextInt();
        double depreciacionAnual = ((inicial - rescate) / anios);
        System.out.println("Depreciacion anual: " + depreciacionAnual);
        sc.close();
    }
}
