package Modulo_3_Ejercicios_java_Principiantes;

import java.util.Scanner;

public class M3_Ejercicio_5 {

    public static void main(String[] args) {

        /* Este programa contiene una lista de días de la semana y permite al usuario ingresar un día
         * para buscar cuántas veces aparece en la lista. Luego, muestra el resultado al usuario.
         */

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);
        
        // Array que contiene los días de la semana almacenados en la lista
        String[] listaPalabras = new String[] {"lunes", "martes", "miercoles", "lunes", "lunes", "martes", "jueves", "viernes", "viernes"};
        
        // Variable para contar las veces que el día ingresado aparece en el array
        int contador = 0;
        
        // Mensaje que solicita al usuario que ingrese un día de la semana
        System.out.println("Ingrese un día de la semana y comprobamos cuántas veces aparece en la lista:");
        
        // Lee la palabra ingresada por el usuario y la almacena en la variable `diaSemana`
        String diaSemana = teclado.nextLine();
        
        // Bucle `for-each` para recorrer cada elemento del array `listaPalabras`
        for (String dias : listaPalabras) {
            // Compara el valor de `dias` (cada elemento del array) con la palabra ingresada por el usuario
            // Convierte ambas palabras a minúsculas para hacer una comparación insensible a mayúsculas/minúsculas
            if (dias.toLowerCase().equals(diaSemana.toLowerCase())) {
                // Si hay una coincidencia, incrementa el contador
                contador++;
            }
        }

        // Condicional para mostrar el resultado
        if (contador > 0) {
            // Si el contador es mayor que 0, significa que el día fue encontrado en la lista
            // Se muestra cuántas veces aparece el día
            System.out.println("El día de la semana ingresado -> ✅ " + diaSemana + " <- se encontró -> " + contador + " <- veces.");
        } else {
            // Si el contador es 0, el día no se encuentra en la lista
            System.out.println(diaSemana + " <-- ⛔ No se encontró.");
        }
        
        // Cierra el objeto Scanner para liberar los recursos
        teclado.close();
    }
}
