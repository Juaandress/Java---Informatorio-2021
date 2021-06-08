import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio1 {
//    Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina,
//    luego imprimir por pantalla el ranking
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("Ingresa una ciudad: (Si desea terminar presione 0)");
            ciudades.add(s.nextLine());
            if(Objects.equals(ciudades.get(ciudades.size() - 1), "0")){
                flag = false;
            }
        }
        while(flag);

        for(int i=0;i<ciudades.toArray().length-1;i++){
            System.out.printf("#%d - %s%n", (i+1), ciudades.get(i));
        }
        ciudades.remove(ciudades.size()-1);
        System.out.println(ciudades);
    }
}