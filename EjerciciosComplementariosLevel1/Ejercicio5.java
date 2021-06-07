import java.util.Scanner;
public class Ejercicio5 {
//    Se desea una aplicación que solicite 2 números enteros y
//    realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
    public static void main(String[] args) {
        System.out.println("Introduzca 2 numeros enteros: ");
        Scanner s = new Scanner(System.in);
        int resultado = 0;
        int primerNumero = s.nextInt();
        int segundoNumero = s.nextInt();
        for(int i=0; i<segundoNumero; i++){
            resultado+=primerNumero;
        }
        System.out.println(resultado);
    }
}
