import java.util.*;

public class FuncionEnteros {

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
        List<Integer> lista = Arrays.asList(2, 7, 5, 6, 3);
        
        int[] resultado = obtenerMinMax(lista);
        
        System.out.println("El número más pequeño es: " + resultado[0]);
        System.out.println("El número más grande es: " + resultado[1]);
    }
}