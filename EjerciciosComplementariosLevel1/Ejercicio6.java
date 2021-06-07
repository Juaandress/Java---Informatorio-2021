import java.util.Scanner;
public class Ejercicio6 {
//    Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia
//    (sin uso de librerías).
    public static void main(String[] args) {
        System.out.println("Introduzca 2 numeros enteros: ");
        Scanner s = new Scanner(System.in);
        int resultado = 1;
        int base = s.nextInt();
        int exponente = s.nextInt();
        for(int i=0; i<exponente; i++){
            resultado*=base;
        }
        System.out.println(base+" elevado a "+exponente+" = "+resultado);
    }
}
