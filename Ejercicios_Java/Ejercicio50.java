import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x: "); double x = sc.nextDouble();
        System.out.print("y: "); double y = sc.nextDouble();
        System.out.print("Radio r: "); double r = sc.nextDouble();
        boolean sobreOCircunferencia = (((x * x) + (y * y)) <= (r * r));
        System.out.println("El punto cae sobre o dentro de la circunferencia: " + sobreOCircunferencia);
        sc.close();
    }
}
