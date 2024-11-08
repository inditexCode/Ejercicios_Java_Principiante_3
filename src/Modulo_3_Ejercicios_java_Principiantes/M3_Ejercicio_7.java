package Modulo_3_Ejercicios_java_Principiantes;

public class M3_Ejercicio_7 {

    public static void main(String[] args) {
        
        /* Este programa almacena una serie de números enteros en un array y calcula la suma de todos los números
         * en dicho array. Al final, muestra el resultado de la suma.
         */

        // Definimos un array de enteros con algunos números predefinidos
        int[] arrayEnteros = new int[] {5, 8, 6, 9, 7, 4, 56, 2, 1};
        
        // Variable para almacenar la suma total de los números
        int suma = 0;
        
        // Bucle `for-each` que recorre cada número dentro del array `arrayEnteros`
        for (int numeros : arrayEnteros) {
            // En cada iteración, se suma el valor actual de `numeros` al acumulador `suma`
            suma += numeros;
        }
        
        System.out.println("La suma de los números dentro del array es -> " + suma);
    }
}
