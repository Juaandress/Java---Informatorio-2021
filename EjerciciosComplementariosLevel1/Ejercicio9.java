import java.util.Scanner;

public class Ejercicio9 {

//    Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
    public static void main(String[] args) {
        System.out.println("Ingresar una frase o texto: ");
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        s.close();
        contador(in, 'a');
    }
    public static void contador(String in, Character x){
        int res= 0;
        for(char ch: in.toCharArray()) {
            if(ch == x)
                res = res+ 1;
        }
        System.out.print(res);
    }
}
