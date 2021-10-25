import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String args[]) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        List<Integer> valorPorHora = new ArrayList<>();
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);
        List<Integer> totales = new ArrayList<>();
        for (int i = 0; i < horasTrabajadas.size(); i++) {
            int t = horasTrabajadas.get(i) * valorPorHora.get(i);
            totales.add(t);
        }
        int totalFinal = 0;
        for (Integer t : totales) {
            totalFinal += t;
        }
        System.out.println(totales);
        System.out.println("El total final a cobrar es $" + totalFinal);
    }
}