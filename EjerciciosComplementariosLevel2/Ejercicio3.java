import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {

//    Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa
//    (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir,
//    imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
    public static void main(String[] args) {
        List<Integer> cartas = new ArrayList<>();
        cartas.add(1);
        cartas.add(2);
        cartas.add(3);
        cartas.add(4);
        cartas.add(5);
        cartas.add(6);
        cartas.add(7);
        for(int i=0;i<=cartas.size()-1;i++){
            System.out.println(cartas.get(i));
        }
        System.out.println("\n ======================== \n");
        for(int i=cartas.size()-1;i>=0;i--){
            System.out.println(cartas.get(i));
        }
        System.out.println("\n ======================== \n");
        Collections.shuffle(cartas);
        for(int i=0;i<cartas.size()-1;i++){
            System.out.println(cartas.get(i));
        }
    }
}
