import java.util.Scanner;

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
}