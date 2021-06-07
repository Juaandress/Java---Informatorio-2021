import java.util.Scanner;

public class Ejercicio3 {
    //        Confeccionar un programa que dado un número                   1
    //        entero como dato de entrada imprima la secuencia              12
    //        de números (incrementos de 1) de la siguiente forma:          123
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner s = new Scanner(System.in);
        int numeroIngresado = s.nextInt();

        //loop que realiza el salto de linea.
        for (int i = 1; i <= numeroIngresado; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j+"\t");
            }
            System.out.println();

        }
    }
}

