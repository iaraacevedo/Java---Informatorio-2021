import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);

        System.out.println("Ingresa nombre y apellido: ");
        String nombreApellido = ing.nextLine();
        System.out.println("Ingresa edad: ");
        String edad = ing.nextLine();
        System.out.println("Ingresa direccion: ");
        String direccion = ing.nextLine();
        System.out.println("Ingresa ciudad: ");
        String ciudad = ing.nextLine();

        ing.close();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombreApellido);

    }
}
