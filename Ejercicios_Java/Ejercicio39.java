import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingreso anual: "); double ingreso = sc.nextDouble();
        System.out.print("Puntaje crediticio: "); int puntaje = sc.nextInt();
        boolean gold = ((ingreso >= 300000) && (puntaje > 700));
        System.out.println("Califica para tarjeta Gold: " + gold);
        sc.close();
    }
}
