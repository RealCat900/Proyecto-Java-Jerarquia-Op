import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1: "); int n1 = sc.nextInt();
        System.out.print("n2: "); int n2 = sc.nextInt();
        System.out.print("n3: "); int n3 = sc.nextInt();
        boolean alMenosUnPar = (((n1 % 2) == 0) || ((n2 % 2) == 0) || ((n3 % 2) == 0));
        System.out.println("Al menos uno es par: " + alMenosUnPar);
        sc.close();
    }
}
