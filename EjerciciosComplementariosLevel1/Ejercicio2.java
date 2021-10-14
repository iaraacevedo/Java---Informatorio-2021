import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int numero1 = ing.nextInt();
        System.out.println("Introduce el segundo número:");
        int numero2 = ing.nextInt();

        int suma = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + suma);

        int multiplicacion = numero1 * numero2;
        System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);

        int resta = numero1 - numero2;
        System.out.println(numero1 + " - " + numero2 + " = " + resta);

        int division = numero1 / numero2;
        System.out.println(numero1 + " / " + numero2 + " = " + division);

        int modulo = numero1 % numero2;
        System.out.println(numero1 + " % " + numero2 + " = " + modulo);

        ing.close();
    }
}
