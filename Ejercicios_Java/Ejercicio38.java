import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Aportacion Socio A: "); double aportaA = sc.nextDouble();
        System.out.print("Aportacion Socio B: "); double aportaB = sc.nextDouble();
        System.out.print("Ganancia total: "); double ganancia = sc.nextDouble();
        double parteA = (ganancia * (aportaA / (aportaA + aportaB)));
        System.out.println("Parte de ganancia del Socio A: " + parteA);
        sc.close();
    }
}
