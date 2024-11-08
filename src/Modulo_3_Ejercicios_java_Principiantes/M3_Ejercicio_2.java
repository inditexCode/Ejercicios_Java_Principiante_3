package Modulo_3_Ejercicios_java_Principiantes;  

import java.util.Scanner;  

public class M3_Ejercicio_2 { 

    public static void main(String[] args) {  

        // Escribe un programa que solicite 5 notas al usuario y calcule la nota media.
    	
        System.out.println("===> Ingrese 5 notas y te devolvere el promedio de las mismas <==="); 

        int cantNotas = 5;  // Declaramos una variable que guarda la cantidad de notas a ingresar. En este caso, 5.

        Scanner teclado = new Scanner(System.in);  // Creamos un objeto de la clase Scanner para capturar la entrada del usuario desde la consola.

        int[] notas = new int[cantNotas];  // Creamos un arreglo de enteros para almacenar las 5 notas ingresadas por el usuario.

        // Bucle 'for' para ingresar las 5 notas
        for (int i = 0; i < notas.length; i++) {  // Recorremos el arreglo 'notas' de tamaño 'cantNotas' (5 en este caso).
            System.out.println("Ingrese la Nota ✅");  // Solicita al usuario que ingrese una nota.
            notas[i] = Integer.parseInt(teclado.nextLine());  // Captura la nota ingresada por el usuario, la convierte a entero y la almacena en el arreglo 'notas' en la posición 'i'.
        }

        // Inicializamos variables para calcular el promedio
        float promedio = 0;  // Variable para almacenar la suma total de las notas.
        int numeroNotas = 0;  // Variable para contar cuántas notas válidas (no negativas) se han ingresado.

        // Bucle 'for-each' para recorrer cada nota en el arreglo 'notas'
        for (int nota : notas) {  // 'nota' tomará el valor de cada elemento del arreglo 'notas' en cada iteración.
            if (nota == -1)  // Si el valor de la nota es -1 ( nota inválida ).
                continue;  // Si la nota es -1, se omite y se pasa a la siguiente iteración sin sumarla.
            promedio += nota;  // Suma la nota al total del promedio.
            numeroNotas++;  // Incrementa el contador de notas válidas.
        }

        promedio /= numeroNotas;// Calculamos el promedio dividiendo la suma total de las notas por la cantidad de notas válidas.
        System.out.println("Promedio de notas ingresadas -> " + promedio);  

        teclado.close();  
    }
}
