import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Promedio academico: "); double promedio = sc.nextDouble();
        System.out.print("Ingreso familiar mensual: "); double ingreso = sc.nextDouble();
        System.out.print("Numero de hermanos estudiantes: "); int hermanos = sc.nextInt();
        boolean beca = ((promedio >= 9.5) || ((ingreso < 8000) && (hermanos > 2)));
        System.out.println("Obtiene beca universitaria: " + beca);
        sc.close();
    }
}
