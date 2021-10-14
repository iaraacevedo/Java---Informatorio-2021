import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);
        System.out.println("Introduce texto");
        String c = ing.nextLine();
        System.out.println("Introduce letra a contar");
        String letra = ing.nextLine();

        char[] arrayChar = c.toCharArray();
        char[] arrayChar2 = letra.toCharArray();
        int cont = 0;

        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == arrayChar2[0])
                cont += 1;
        }
        ing.close();
        System.out.println("El texto ingresado es: " + c);
        System.out.println("La cantidad de veces que aparece '" + letra + "' es: " + cont);
    }
}
