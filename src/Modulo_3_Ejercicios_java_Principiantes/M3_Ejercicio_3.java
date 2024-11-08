package Modulo_3_Ejercicios_java_Principiantes;

import java.util.Scanner;

public class M3_Ejercicio_3 {

    public static void main(String[] args) {

        // 3 - Escribe un programa que, partiendo de una lista de palabras, busque una introducida por el usuario
        // e indique si está o no en dicha lista.
    	
        System.out.println("===> 🌐 Ingrese un lenguaje de programación y comprobemos si se encuentra en el programa <===");

        // Definimos un arreglo con los lenguajes de programación predefinidos.
        String[] array = new String[]{"Java", "Javascript", "PHP", "React", "c++", "python" };

        // Creamos un objeto Scanner para obtener la entrada del usuario.
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario que ingrese el lenguaje de programación que quiere buscar.
        System.out.println("Ingrese el lenguaje que desea buscar...");
        String lenguaje = teclado.nextLine();

        boolean encontrado = false; // Creamos una bandera para verificar si el lenguaje está en el array.

        // Recorremos el arreglo de lenguajes para ver si el lenguaje ingresado está en la lista.
        for (String palabra : array) {
            // Comparamos el lenguaje introducido, ignorando mayúsculas y minúsculas.
            if (lenguaje.toLowerCase().equals(palabra.toLowerCase())) {
                encontrado = true;  // Marcamos que se ha encontrado el lenguaje.
                break;  // Salimos del bucle, ya que ya hemos encontrado el lenguaje.
            }
        }

        // Imprimimos el resultado basado en si encontramos o no el lenguaje.
        if (encontrado) {
            System.out.println("El lenguaje -> " + lenguaje + " <- Se encuentra en la lista.");
        } else {
            System.out.println("El lenguaje -> " + lenguaje + " <- No se encuentra en la lista.");
        }

        teclado.close(); // Cerramos el scanner para liberar los recursos.

    }
}
