
/*import java.util.Scanner;

public class Ejercicio1Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        // Inicialmente asumimos que el número es primo
        boolean esPrimo = true;
        
        // Los números menores o iguales a 1 no se consideran primos
        if (numero <= 1) {
            esPrimo = false;
        } else {
            // Solo es necesario verificar hasta la raíz cuadrada del número
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    // Si encontramos un divisor, el número no es primo
                    esPrimo = false;
                    break;
                }
            }
        }
        
        // Imprimir el resultado
        if (esPrimo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
        
        scanner.close();
    }
}*/

import java.util.*;

public class MinMaxFinder {

    /**
     * Esta función recibe una lista de enteros y retorna un arreglo de dos elementos:
     * en la posición 0 se encuentra el número más pequeño y en la posición 1 el número más grande.
     *
     * @param lista La lista de enteros a evaluar.
     * @return Un arreglo de dos enteros: [mínimo, máximo].
     * @throws IllegalArgumentException Si la lista es null o está vacía.
     */
    public static int[] obtenerMinMax(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser null o estar vacía.");
        }
        
        int min = lista.get(0);
        int max = lista.get(0);
        
        // Recorrer la lista para encontrar el mínimo y el máximo
        for (int num : lista) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        return new int[] { min, max };
    }
    
    public static void main(String[] args) {
        // Ejemplo de uso de la función obtenerMinMax
        List<Integer> lista = Arrays.asList(3, 5, 7, 2, 8, -1, 4);
        
        int[] resultado = obtenerMinMax(lista);
        
        System.out.println("El número más pequeño es: " + resultado[0]);
        System.out.println("El número más grande es: " + resultado[1]);
    }
}

