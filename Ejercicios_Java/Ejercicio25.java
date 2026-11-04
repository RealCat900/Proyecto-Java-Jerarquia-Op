import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota Examen 1: "); double e1 = sc.nextDouble();
        System.out.print("Nota Examen 2: "); double e2 = sc.nextDouble();
        boolean aprueba = ((e1 >= 80) || (e2 >= 80));
        System.out.println("Aprueba la certificacion: " + aprueba);
        sc.close();
    }
}
