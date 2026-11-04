import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sueldo mensual: "); double sueldo = sc.nextDouble();
        System.out.print("Anios de antiguedad: "); int antiguedad = sc.nextInt();
        System.out.print("Deudas actuales: "); double deudas = sc.nextDouble();
        boolean aprueba = ((sueldo > 15000) && (antiguedad > 3) && (deudas < 5000));
        System.out.println("Prestamo aprobado: " + aprueba);
        sc.close();
    }
}
