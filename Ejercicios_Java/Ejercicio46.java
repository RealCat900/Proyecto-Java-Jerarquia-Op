import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dia: "); int dia = sc.nextInt();
        System.out.print("Mes: "); int mes = sc.nextInt();
        boolean fechaValida = (((mes >= 1) && (mes <= 12)) && ((dia >= 1) && (dia <= 31)));
        System.out.println("Fecha valida (simple): " + fechaValida);
        sc.close();
    }
}
