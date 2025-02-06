
public class FuncionPolindromo {

    /**
     * Determina si una palabra o frase es un palíndromo.
     * Se ignoran mayúsculas, minúsculas y espacios.
     *
     * @param texto La palabra o frase a evaluar.
     * @return true si es un palíndromo, false en caso contrario.
     */
    public static boolean esPalindromo(String texto) {
        // Eliminar espacios y convertir a minúsculas
        String textoLimpio = texto.replaceAll("\\s+", "").toLowerCase();

        int longitud = textoLimpio.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (textoLimpio.charAt(i) != textoLimpio.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Ejemplos de prueba
        String[] ejemplos = {
            "Anita lava la tina",
            "radar",
            "Hola Mundo",
            "A man a plan a canal Panama"
        };

        for (String ejemplo : ejemplos) {
            if (esPalindromo(ejemplo)) {
                System.out.println("\"" + ejemplo + "\" es un palíndromo.");
            } else {
                System.out.println("\"" + ejemplo + "\" no es un palíndromo.");
            }
        }
    }
}

