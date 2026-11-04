import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota Examenes (40%): ");
        double examenes = sc.nextDouble();
        System.out.print("Nota Tareas (30%): ");
        double tareas = sc.nextDouble();
        System.out.print("Nota Proyecto (30%): ");
        double proyecto = sc.nextDouble();
        double calificacionFinal = ((examenes * 0.40) + (tareas * 0.30) + (proyecto * 0.30));
        System.out.println("Calificacion final: " + calificacionFinal);
        sc.close();
    }
}
