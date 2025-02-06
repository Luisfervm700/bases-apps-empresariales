import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListaNombreString {
    public static void main(String[] args) {
        // Lista de nombres para trabajar
        List<String> nombres = Arrays.asList("Ana", "Antonio", "Berta", "Alfredo", "Andrea", "Bruno");

        // 1. Filtrar los nombres que comienzan con "A"
        List<String> nombresConA = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Nombres que comienzan con A: " + nombresConA);

        // 2. Convertir todos los nombres a mayúsculas
        List<String> nombresMayusculas = nombres.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Nombres en mayúsculas: " + nombresMayusculas);

        // 3. Contar cuántos nombres tienen más de 5 letras
        long countMasDe5 = nombres.stream()
                .filter(nombre -> nombre.length() > 5)
                .count();
        System.out.println("Cantidad de nombres con más de 5 letras: " + countMasDe5);

        // 4. Contar cuántas veces aparece cada palabra en una lista de Strings
        List<String> palabras = Arrays.asList("java", "streams", "java", "colecciones", "streams", "streams", "codigo");
        Map<String, Long> conteoPalabras = palabras.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Conteo de palabras: " + conteoPalabras);
    }
}