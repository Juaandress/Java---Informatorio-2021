public class Ejercicio7 {
//    Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo),
//    nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final.
//    Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez
//    múltiplo de ambos colocara “FizzBuzz”.
//    Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor
//    debe frenar (no se incluye en el cálculo)
//    Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
    public static void main(String[] args) {
        
        int a = 1;
        int b =  6;
        fizzBuzzFuncion(a,b);
        System.out.print(fizzBuzzFuncion(a, b));
    }
        public static List fizzBuzzFuncion(int a, int b) {
            List<String> numeros = new ArrayList<>();
            for (int i = a; i < b; i++) {
                if ((i%2==0) && (i%3==0)) {numeros.add("FizzBuzz");}
                else if (i%2==0) { numeros.add("Fizz");}
                else if (i%3==0) {numeros.add("Buzz");}
                else {String num = String.valueOf(i);
                    numeros.add(num);}               
            }
            return numeros;
            
        }
    }
}
