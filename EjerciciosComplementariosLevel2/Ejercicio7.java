import java.util.*;
public class Ejercicio7 {
    public static List<String> FizzBuzzFuncion(int a, int b) {
        List<String> num = new ArrayList<>();

        for (int i = a; i < b; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                num.add("FizzBuzz");
            } else if (i % 2 == 0) {
                num.add("Fizz");
            } else if (i % 3 == 0) {
                num.add("Buzz");
            } else {
                num.add("" + i);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();

        System.out.println(FizzBuzzFuncion(a, b));
        entrada.close();
    }
}