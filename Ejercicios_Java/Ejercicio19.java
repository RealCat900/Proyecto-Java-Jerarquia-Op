import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor decimal: ");
        double n = sc.nextDouble();
        boolean negativo = (n < 0);
        System.out.println("Es negativo: " + negativo);
        sc.close();
    }
}
