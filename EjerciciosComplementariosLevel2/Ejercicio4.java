import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
    ArrayList<String> list =new ArrayList<String>();
list.add("Iara");
list.add("Lorenzo");
list.add("Enzo");
list.add("Romeo");
list.add("Juana");
list.add("Martina");
list.add("Fernando");
list.add("Cielo");
list.add("Gonzalo");
list.add("Eliana");
list.add("Wanda");
list.add("Elisa");
List<String> geografia = list.subList(0,4);
List<String> lengua = list.subList(4,8);
List<String> matematicas = list.subList(8,12);

System.out.println("Lista completa de estudiantes");
for (String c : list) {
    System.out.println(c);
}
System.out.println(" ");
System.out.println("ALUMNOS DEL CURSO DE GEOGRAFIA: ");
for (String g : geografia) {
    System.out.println(g);
}
System.out.println(" ");
System.out.println("ALUMNOS DEL CURSO DE LENGUA: ");
for (String l : lengua) {
    System.out.println(l);
}
System.out.println(" ");
System.out.println("ALUMNOS DEL CURSO DE MATEMATICAS: ");
for (String m : matematicas) {
    System.out.println(m);
}
}
}
