import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int m = ing.nextInt();
        System.out.println("Introduce el segundo número:");
        int n = ing.nextInt();
        int mul = 0;
        for (int i = 0; i < n; i++) {
            mul += m;
        }
        ing.close();
        System.out.println(m + " x " + n + " = " + mul);
    }
}