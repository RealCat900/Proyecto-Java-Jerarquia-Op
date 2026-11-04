import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sensor s1 (1/0): "); int s1 = sc.nextInt();
        System.out.print("Sensor s2 (1/0): "); int s2 = sc.nextInt();
        System.out.print("Sensor s3 (1/0): "); int s3 = sc.nextInt();
        boolean todosEncendidos = ((s1 == 1) && (s2 == 1) && (s3 == 1));
        System.out.println("Los tres sensores encendidos: " + todosEncendidos);
        sc.close();
    }
}
