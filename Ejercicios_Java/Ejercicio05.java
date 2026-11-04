import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Horas trabajadas: ");
        double horas = sc.nextDouble();
        System.out.print("Costo por hora: ");
        double costo = sc.nextDouble();
        double bruto = (horas * costo);
        double neto = ((bruto - (bruto * 0.12)) - 150);
        System.out.println("Sueldo bruto: " + bruto);
        System.out.println("Salario neto: " + neto);
        sc.close();
    }
}
