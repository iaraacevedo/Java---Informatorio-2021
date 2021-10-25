import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashSet<Employee> empleado = new HashSet<>();
        HashMap<Integer, Float> sueldo = new HashMap<>();
        empleado.add(new Employee("Martina Acevedo", 43939339, 8, 300));
        empleado.add(new Employee("Agostina Acevedo", 43939333, 3, 200));
        empleado.add(new Employee("Nehemias Acevedo", 43939334, 5, 300));
        empleado.add(new Employee("Julieta Pelozo", 43939336, 4, 400));
        empleado.add(new Employee("Wanda Escoses", 43939330, 6, 500));
        for (Employee crearUnaTabla : empleado) {
            sueldo.put(crearUnaTabla.clave(), crearUnaTabla.monto());
        }
        System.out.println("Sueldos:");
        sueldo.forEach((dni, monto) -> System.out.println("DNI " + dni + " / Sueldo $" + monto));
    }
}

class Employee {
    String nombre;
    int dni;
    float horasTrabajadas;
    float valorPorHora;

    public Employee(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int clave() {
        return this.dni;
    }

    public float monto() {
        return this.horasTrabajadas * this.valorPorHora;
    }
}