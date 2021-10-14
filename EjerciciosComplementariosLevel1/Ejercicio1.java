import java.util.Scanner; 
public class Ejercicio1 {
    public static void main (String [ ] args) {
        System.out.println ("Ingrese nombre de usuario:");

        String usuario = "";

        Scanner ing = new Scanner (System.in);
        usuario = ing.nextLine ();
        System.out.println ("Hola " + usuario);
        ing.close();
    } 
} 