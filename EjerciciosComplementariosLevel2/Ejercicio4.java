import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
//    Cargar un arrayList con 12 nombres de estudiantes (String),
//    luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
    public static void main(String[] args) {
        //Instancio las listas
        List<String> students = new ArrayList<>();
        List<String> course1 = new ArrayList<>();
        List<String> course2 = new ArrayList<>();
        List<String> course3 = new ArrayList<>();
        //Cargo un arreglo
        students.add("Pancho");
        students.add("Pedro");
        students.add("Juan");
        students.add("Claudio");
        students.add("Fede");
        students.add("Jose");
        students.add("Pepe");
        students.add("Chewbacca");
        students.add("Ovi Ban");
        students.add("Messi");
        students.add("Aguero");
        students.add("Di Maria");
        //Imprimo el total de estudiantes y los separo en grupos para imprimirlos nuevamente
        System.out.println("Estudiantes: ");
        System.out.println(students);
        List<String> curso1 = students.subList(0,4);
        List<String> curso2 = students.subList(4,8);
        List<String> curso3 = students.subList(8,12);
        System.out.println("Curso 1: \n"+curso1);
        System.out.println("Curso 2: \n"+curso2);
        System.out.println("Cruso C: \n"+curso3);
    }
}
