import java.util.Scanner;

public class Ejercicio1 {
    //        Solicitar por consola el nombre del usuario e imprimir
    //        por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombreIngresado = s.nextLine();
        System.out.println("Su nombre es: "+nombreIngresado);


    }
}
