import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado a: "); double a = sc.nextDouble();
        System.out.print("Lado b: "); double b = sc.nextDouble();
        System.out.print("Lado c: "); double c = sc.nextDouble();
        boolean isosceles = ((a == b) || (a == c) || (b == c));
        System.out.println("Triangulo isosceles: " + isosceles);
        sc.close();
    }
}
