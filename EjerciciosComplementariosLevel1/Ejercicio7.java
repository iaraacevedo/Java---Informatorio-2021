import java.util.Scanner;

public class Ejercicio7 {
    static String minAMayuscula(String car) {
        String resultado = "";
        char texto = ' ';
        for (int i = 0; i < car.length(); i++) {
            if (car.charAt(i) >= 'a' && car.charAt(i) <= 'z') {
                texto = (char) (car.charAt(i) - 32);
            } else {
                texto = (char) (car.charAt(i));
            }
            resultado += texto;
        }
        return resultado;
    }

    public static void main(String[] args) {
        String mayuscula;
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingrese una palabra en minúscula: ");
        mayuscula = ing.nextLine();
        System.out.println(minAMayuscula(mayuscula));
        ing.close();
    }
}
