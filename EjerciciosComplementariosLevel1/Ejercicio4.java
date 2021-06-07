import java.util.Scanner;
public class Ejercicio4 {
    //    Realizar un programa que calcule el factorial de un número:
    //    n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
    //    Sin hacer uso de librerías.
    public static void main(String[] args) {
        double factorial = 1;
        // Damos a elegir el numero al usuario
        System.out.println("Ingrese un numero: ");
        Scanner s = new Scanner(System.in);
        double numero= s.nextDouble();
        while ( numero!=0) {
            factorial=factorial*numero;
            numero--;
        }
        System.out.println("El factorial de ese numero es " + factorial);
    }
}