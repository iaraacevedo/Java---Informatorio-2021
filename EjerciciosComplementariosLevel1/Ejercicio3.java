import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        int num = ing.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print(a + " ");
            }
            ing.close();
            System.out.println("");
        }
    }
}
