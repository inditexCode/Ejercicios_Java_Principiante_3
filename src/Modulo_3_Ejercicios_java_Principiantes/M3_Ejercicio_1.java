package Modulo_3_Ejercicios_java_Principiantes;

import java.util.Random;  // Importamos la clase Random que nos permite generar números aleatorios

public class M3_Ejercicio_1 {

    public static void main(String[] args) {

        // Escribe un programa que muestre, aleatoriamente, una palabra 
        // (Puedes partir de un diccionario almacenado en un array).
        
        System.out.println("===> Vamos a generar palabras aleatoriamente <==="); 
        System.out.println(); 

        // Definimos un arreglo de cadenas (String) que contiene una lista de colores
        String[] colores = new String[]{"rojo", "verde", "amarillo", "azul", "negro", "blanco", "gris"};
        
        // Creamos un objeto de la clase Random para generar números aleatorios
        Random random = new Random();

        // Generamos un número aleatorio entre 0 y 6 (7 posibles valores) que se usará como índice
        int aleatorio = random.nextInt(7);  // nextInt(7) devuelve un valor entre 0 y 6 (inclusive)

        // Imprimimos el color correspondiente al índice aleatorio seleccionado
        // Accedemos al arreglo 'colores' con el índice aleatorio y mostramos el resultado
        System.out.println("Color => " + colores[aleatorio]);

    }

}
