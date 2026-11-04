import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total de horas: ");
        int horas = sc.nextInt();
        int dias = (horas / 24);
        int horasSobrantes = (horas % 24);
        System.out.println("Dias completos: " + dias);
        System.out.println("Horas sobrantes: " + horasSobrantes);
        sc.close();
    }
}
