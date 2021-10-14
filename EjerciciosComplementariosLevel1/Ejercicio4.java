import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int fact = 1;
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = ing.nextInt();
        for (int i = num; i > 0; i--) {
            fact = fact * i;
        }
        ing.close();
        System.out.println("El factorial de " + num + " es: " + fact);
    }

}
