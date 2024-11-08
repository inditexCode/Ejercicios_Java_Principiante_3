package Modulo_3_Ejercicios_java_Principiantes;

import java.util.Scanner;

public class M3_Ejercicio_8 {

    public static void main(String[] args) {

        // Definimos un array con el nombre de las materias
        String[] arrayMaterias = {"Matemáticas", "Programación", "Lógica", "Física", "Química"};
        
        // Creamos un array para almacenar las notas de cada materia, con una longitud igual a `arrayMaterias`
        double[] notas = new double[arrayMaterias.length];
        double suma = 0;  // Variable para acumular la suma de las notas

        Scanner teclado = new Scanner(System.in);

        // Bucle `for` para recorrer cada materia en `arrayMaterias`
        for (int i = 0; i < arrayMaterias.length; i++) {
            double nota; // Variable temporal para almacenar la nota actual

            // Bucle `while` que valida si la nota ingresada está entre 1 y 10
            while (true) {
                // Muestra un mensaje solicitando la nota de la materia actual
                System.out.print("Ingrese la nota para " + arrayMaterias[i] + " (1 a 10): ");
                
                // Lee la nota ingresada por el usuario y la almacena en `nota`
                nota = teclado.nextDouble();

                // Condicional para verificar si la nota está en el rango 1 a 10
                if (nota >= 1 && nota <= 10) {
                    // Si la nota es válida, la almacena en el array `notas` en la posición correspondiente
                    notas[i] = nota;
                    // Agrega la nota a la variable `suma` para calcular el promedio posteriormente
                    suma += nota;   
                    // Sale del bucle `while` ya que la nota es válida
                    break;
                } else {
                    // Si la nota no está en el rango 1 a 10, muestra un mensaje de error
                    System.out.println("Error: la nota debe ser un valor entre 1 y 10. Inténtelo de nuevo.");
                }
            }
        }

        // Calcula el promedio dividiendo la suma de todas las notas entre el número de materias
        double promedio = suma / arrayMaterias.length;

        System.out.println("\n===> Notas ingresadas:");
        
        // Bucle `for` para mostrar la nota de cada materia, junto con un símbolo indicando si es aprobatoria o no
        for (int i = 0; i < arrayMaterias.length; i++) {
            // Condicional para verificar si la nota es aprobatoria (>6) y agregar un símbolo apropiado
            if (notas[i] > 6) {
                System.out.println(arrayMaterias[i] + ": " + notas[i] + " ✅"); // Nota aprobatoria
            } else {
                System.out.println(arrayMaterias[i] + ": " + notas[i] + " ⛔"); // Nota desaprobatoria
            }
        }

        // Muestra el promedio de todas las notas
        // Agrega un mensaje diferente según si el promedio es aprobatorio o no
        if (promedio > 6) {
            System.out.println("Felicidades tu promedio es: " + promedio + " 🥳"); // Promedio aprobatorio
        } else {
            System.out.println("Sigue estudiando, tu promedio es: " + promedio + " 😫"); // Promedio desaprobatorio
        }

        // Cierra el objeto `Scanner` para liberar los recursos
        teclado.close();
    }
}
