import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int a = ing.nextInt();
        System.out.println("Ingrese el segundo número:");
        int b = ing.nextInt();
        int c = 1;
        for (int i = 1; i <= b; i++) {
            c = c * a;
        }
        ing.close();
        System.out.println(a + " elevado a " + b + " = " + c);
    }
}
