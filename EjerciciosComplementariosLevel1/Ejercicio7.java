import java.util.Scanner;
public class Ejercicio7 {
//    Realizar un Programa que dado un String de entrada en minúsculas lo convierta
//    por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().

    public static void main( String[] args) {
        System.out.println("Introduzca un texto: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();
        String resultado = "";
        for (char ch: input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch += 'A' - 'a';
            }
            resultado = resultado.concat(String.valueOf(ch));
        }
        System.out.println(resultado);
    }
}

