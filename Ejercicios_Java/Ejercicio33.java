import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Minutos totales de estacionamiento: ");
        int minutos = sc.nextInt();
        int horasCobrar = ((minutos + 59) / 60);
        int totalPagar = (horasCobrar * 25);
        System.out.println("Horas cobradas: " + horasCobrar);
        System.out.println("Total a pagar: $" + totalPagar);
        sc.close();
    }
}
