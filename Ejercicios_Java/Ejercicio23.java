import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hora (0-23): ");
        int hora = sc.nextInt();
        boolean valida = ((hora >= 0) && (hora <= 23));
        System.out.println("Hora valida: " + valida);
        sc.close();
    }
}
