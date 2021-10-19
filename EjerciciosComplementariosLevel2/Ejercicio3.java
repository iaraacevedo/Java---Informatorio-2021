import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> baraja = new ArrayList<String>();
        baraja.add("A");
        baraja.add("2");
        baraja.add("3");
        baraja.add("4");
        baraja.add("5");
        baraja.add("6");
        baraja.add("7");
        baraja.add("8");
        baraja.add("9");
        baraja.add("10");
        baraja.add("J");
        baraja.add("Q");
        baraja.add("K");

        System.out.println("ORDEN");
        for (int o = 0; o < baraja.size(); o++) {
            System.out.println(baraja.get(o));
        }

        System.out.println("REVERSA");
        Collections.reverse(baraja);
        for (int r = 0; r < baraja.size(); r++) {
            System.out.println(baraja.get(r));
        }

        System.out.println("DESORDEN");
        Collections.shuffle(baraja);
        for (int d = 0; d < baraja.size(); d++) {
            System.out.println(baraja.get(d));
        }
    }
}