// Clase base Vehiculo
class Vehiculo {
    // Método acelerar en la clase base
    public void acelerar() {
        System.out.println("El vehículo está acelerando.");
    }
}

// Clase derivada Carro que extiende Vehiculo
class Carro extends Vehiculo {
    // Sobrescribir el método acelerar para la clase Carro
    @Override
    public void acelerar() {
        System.out.println("El carro está acelerando rápidamente.");
    }
}

// Clase derivada Moto que extiende Vehiculo
class Moto extends Vehiculo {
    // Sobrescribir el método acelerar para la clase Moto
    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando ágilmente.");
    }
}

public class ClaseVehiculo {
    public static void main(String[] args) {
        // Instanciamos objetos de cada clase
        Vehiculo vehiculoGeneral = new Vehiculo();
        Vehiculo miCarro = new Carro();
        Vehiculo miMoto = new Moto();
        
        // Llamamos al método acelerar() en cada instancia
        System.out.println("Vehiculo:");
        vehiculoGeneral.acelerar();
        
        System.out.println("Carro:");
        miCarro.acelerar();
        
        System.out.println("Moto:");
        miMoto.acelerar();
    }
}
