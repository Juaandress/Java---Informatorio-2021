import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
//    Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2)
//    del resumen de carga de horas semanal de un empleado.
//    Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> salarioPorHora = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();
        int messi = 0;
        int general = 0;
        //solicito cargar valores en las listas
        System.out.println("Ingrese las horas trabajadas por cada empleado: \n");
        cargarValoresEnteroACualquierLista(horasTrabajadas);
        System.out.println("Ingrese el salario por hora de cada empleado: \n");
        cargarValoresEnteroACualquierLista(salarioPorHora);
        //cargo la lista de los totales mientras calculo el total general
        for(int i = 0; i<=horasTrabajadas.size()-1;i++){
            messi = horasTrabajadas.get(i)*salarioPorHora.get(i);
            totales.add(messi);
            general += messi;
        }
        //Imprimo la salida
        System.out.println(totales);
        System.out.println("Total Final: "+general);

    }
    public static void cargarValoresEnteroACualquierLista(List<Integer> x){
        boolean flag = true;
        do{
            System.out.println("Ingresa un valor: (Si desea terminar presione 0)");
            Scanner s = new Scanner(System.in);
            x.add(s.nextInt());
            if((x.get(x.size()-1))==0){
                flag = false;
            }
        }
        while(flag);

        x.remove(x.size()-1);
    }
}

