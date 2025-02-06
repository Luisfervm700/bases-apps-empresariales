// Definición de la interfaz Pagable con el método procesarPago()
interface Pagable {
    void procesarPago();
}

// Clase TarjetaCredito que implementa la interfaz Pagable
class TarjetaCredito implements Pagable {
    private String numeroTarjeta;
    private double monto;

    // Constructor
    public TarjetaCredito(String numeroTarjeta, double monto) {
        this.numeroTarjeta = numeroTarjeta;
        this.monto = monto;
    }

    // Implementación del método procesarPago() para TarjetaCredito
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta de crédito.");
        System.out.println("Número de tarjeta: " + numeroTarjeta);
        System.out.println("Monto a pagar: $" + monto);
    }
}

// Clase TransferenciaBancaria que implementa la interfaz Pagable
class TransferenciaBancaria implements Pagable {
    private String cuentaOrigen;
    private String cuentaDestino;
    private double monto;

    // Constructor
    public TransferenciaBancaria(String cuentaOrigen, String cuentaDestino, double monto) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
    }

    // Implementación del método procesarPago() para TransferenciaBancaria
    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia bancaria.");
        System.out.println("Cuenta origen: " + cuentaOrigen);
        System.out.println("Cuenta destino: " + cuentaDestino);
        System.out.println("Monto a transferir: $" + monto);
    }
}

// Clase principal para probar el funcionamiento de las implementaciones
public class ProcesarPago {
    public static void main(String[] args) {
        // Crear instancias de TarjetaCredito y TransferenciaBancaria
        Pagable pagoTarjeta = new TarjetaCredito("1234-5678-9012-3456", 150.75);
        Pagable pagoTransferencia = new TransferenciaBancaria("Cuenta-001", "Cuenta-002", 250.50);

        // Procesar los pagos utilizando el método procesarPago()
        System.out.println("=== Pago con Tarjeta de Crédito ===");
        pagoTarjeta.procesarPago();

        System.out.println("\n=== Pago con Transferencia Bancaria ===");
        pagoTransferencia.procesarPago();
    }
}
