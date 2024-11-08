package Modulo_3_Ejercicios_java_Principiantes;

import java.util.Scanner;

public class M3_Ejercicio_4 {

    public static void main(String[] args) {
        
        /* Este programa permite al usuario buscar un número en una lista de números enteros predefinida.
         * Después de recibir un número del usuario, el programa busca ese número en el array y cuenta 
         * cuántas veces aparece, indicando al final si el número se encontró y cuántas veces.
         */
        
        System.out.println("===> Sistema de Números...");

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Definimos un array de enteros que contiene una lista de números
        int[] array = new int[] {1, 2, 3, 2, 5, 2, 7, 3, 3, 1};
        
        // Mensaje para el usuario pidiéndole que ingrese un número a buscar en la lista
        System.out.println("===> Ingrese un número para comprobar si se encuentra en el programa <===");
        
        // Lee el número ingresado por el usuario y lo almacena en la variable `numeroIngresado`
        int numeroIngresado = teclado.nextInt();
        
        // Variable para contar las veces que aparece el número ingresado en el array
        int cantidadEncontrada = 0;
        
        // Bucle `for-each` que recorre cada número en el array
        for (int numero : array) {
            // Compara el número actual del array con el número ingresado por el usuario
            if (numero == numeroIngresado) {
                // Si son iguales, incrementa `cantidadEncontrada` en 1
                cantidadEncontrada++;
            }
        }
        
        // Condicional para mostrar el resultado al usuario
        if (cantidadEncontrada > 0) {
            // Si `cantidadEncontrada` es mayor a 0, significa que el número se encontró al menos una vez
            System.out.println("El número ingresado " + numeroIngresado + " se encuentra " + cantidadEncontrada + " veces ✅");
        } else {
            // Si `cantidadEncontrada` es 0, el número no se encontró en el array
            System.out.println("El número ingresado " + numeroIngresado + " no se encuentra en la lista ⛔");
        }

        // Cierra el objeto Scanner para liberar los recursos
        teclado.close();
    }
}
