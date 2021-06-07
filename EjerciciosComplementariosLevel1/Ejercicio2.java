import java.util.Scanner;

public class Ejercicio2 {
//    Realizar un programa que solicite por consola 2 números enteros. Para luego
//    imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división)
//    de ambos números.
    public static void main(String[] args)
    {
        System.out.println("Ingrese 2 valores numericos: ");
        Scanner s = new Scanner(System.in);
        int primerValor = s.nextInt();
        int segundoValor = s.nextInt();
        int suma = primerValor + segundoValor;
        int resta = primerValor - segundoValor;
        int multiplicacion = primerValor*segundoValor;
        int division = primerValor/segundoValor;
        int modulo = primerValor%segundoValor;
        System.out.println(primerValor+ " + " +segundoValor + " = " + suma);
        System.out.println(primerValor+ " - " +segundoValor + " = " + resta);
        System.out.println(primerValor+ " * " +segundoValor + " = " + multiplicacion);
        System.out.println(primerValor+ " / " +segundoValor + " = " + division);
        System.out.println(primerValor+ " % " +segundoValor + " = " + modulo);

    }

}
