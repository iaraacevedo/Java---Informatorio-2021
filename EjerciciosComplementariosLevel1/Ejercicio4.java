import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
            Scanner ent = new Scanner(System.in);
            System.out.print("Introduzca un numero entero: ");
            Integer num = ent.nextInt();
            ent.close();
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i; 
            }
            System.out.println("El Factorial de " + num + " es " + factorial);
        }

}
