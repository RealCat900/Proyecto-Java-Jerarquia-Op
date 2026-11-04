import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura (C): ");
        double temp = sc.nextDouble();
        boolean congelado = (temp <= 0);
        System.out.println("Agua en congelacion: " + congelado);
        sc.close();
    }
}
