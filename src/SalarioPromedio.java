import java.util.ArrayList;
import java.util.List;

// Clase Empleado con atributos nombre, salario y cargo.
class Empleado {
    private String nombre;
    private double salario;
    private String cargo;

    // Constructor
    public Empleado(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
}

// Clase Empresa que contiene una lista de empleados y un método para calcular el salario promedio.
class Empresa {
    private List<Empleado> empleados;

    // Constructor que inicializa la lista de empleados.
    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    // Método para agregar un empleado a la lista.
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método que calcula y retorna el salario promedio de los empleados.
    public double calcularSalarioPromedio() {
        if (empleados.isEmpty()) {
            return 0;
        }
        double sumaSalarios = 0;
        for (Empleado e : empleados) {
            sumaSalarios += e.getSalario();
        }
        return sumaSalarios / empleados.size();
    }
}

public class SalarioPromedio {
    public static void main(String[] args) {
        // Crear una instancia de Empresa
        Empresa miEmpresa = new Empresa();
        
        // Agregar empleados a la empresa
        miEmpresa.agregarEmpleado(new Empleado("Juan", 1500.0, "Desarrollador"));
        miEmpresa.agregarEmpleado(new Empleado("María", 2000.0, "Gerente"));
        miEmpresa.agregarEmpleado(new Empleado("Carlos", 1800.0, "Analista"));
        
        // Calcular y mostrar el salario promedio
        double salarioPromedio = miEmpresa.calcularSalarioPromedio();
        System.out.println("El salario promedio de los empleados es: " + salarioPromedio);
    }
}