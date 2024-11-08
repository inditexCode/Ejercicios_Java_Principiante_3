package Modulo_3_Ejercicios_java_Principiantes;

public class M3_Ejercicio_6 {

    public static void main(String[] args) {
        
        /* Este programa tiene un array de números enteros y encuentra el número más bajo (mínimo)
         * y el número más alto (máximo) dentro del array. El programa no requiere interacción del usuario.
         */

        System.out.println("===> ENCONTRAR EL MÍNIMO DEL ARRAY <===");

        // Array de números enteros donde buscaremos el valor mínimo y máximo
        int[] arrayNumeros = new int[] {-4, 1, -2, 4, 8, 6, 4, 9, 25, 89, 18, 0, -1, 3, 58};
        
        // Inicializamos las variables `minimo` y `maximo` con 0, ya que buscaremos los números más pequeños y más grandes
        int minimo = 0;
        int maximo = 0;
        
        // Bucle `for-each` que recorre cada número en el array `arrayNumeros` para encontrar el mínimo
        for (int numero : arrayNumeros) {
            // Si el número actual es menor que el valor de `minimo`, actualizamos `minimo`
            if (numero < minimo) {
                minimo = numero;
            }
        }
        
        // Bucle `for-each` que recorre cada número en el array `arrayNumeros` para encontrar el máximo
        for (int numero : arrayNumeros) {
            // Si el número actual es mayor que el valor de `maximo`, actualizamos `maximo`
            if (numero > maximo) {
                maximo = numero;
            }
        }

        System.out.println(" El Número mínimo del array es -> " + minimo);

        System.out.println("----------------------------------------------------");

        System.out.println(" Como extra encontramos el mayor número del array");
        System.out.println(" El Número máximo del array es -> " + maximo);
    }
}
