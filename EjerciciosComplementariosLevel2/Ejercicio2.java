import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(0);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        System.out.println("Lista: ");
        for (int i = 0; i < num.size(); i++) {

        System.out.println(num.get(i));
        }
        System.out.println("Tamaño despues de agregar a en la primera y última posición: " + num.size());
        num.remove(0);
        num.remove(5);
        System.out.println("Tamaño antes de agregar a en la primera y última posición:" + num.size());
    }
}