import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
//    Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio
//    de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de
//    la misma (antes y después de agregar a en la primera y última posición).

        public static void main(String[] args) {
            List<Integer> numeros = new ArrayList<>();
            //agrego 5 numeros enteros
            numeros.add(123);
            numeros.add(432);
            numeros.add(542);
            numeros.add(654);
            numeros.add(874);
            for(int i=0;i<numeros.size()-1;i++){
                System.out.println(numeros.get(i));
            }
            System.out.println("tamanio: "+ numeros.size());
            //agrego un numero entero al principio de la lista
            numeros.add(0, 23);
            //agrego un numero entero al final de la lista
            numeros.add(234);
            for(int i=0;i<numeros.size()-1;i++){
                System.out.println(numeros.get(i));
            }
            System.out.println("tamanio: "+ numeros.size());
        }
    }