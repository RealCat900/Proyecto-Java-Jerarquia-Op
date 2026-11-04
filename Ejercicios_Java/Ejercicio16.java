import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso (kg): "); double peso = sc.nextDouble();
        System.out.print("Estatura (m): "); double estatura = sc.nextDouble();
        double imc = (peso / (estatura * estatura));
        boolean sobrepeso = (imc >= 25.0);
        System.out.println("IMC: " + imc);
        System.out.println("Sobrepeso: " + sobrepeso);
        sc.close();
    }
}
