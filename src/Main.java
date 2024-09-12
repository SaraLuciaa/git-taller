import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.Vehiculo;

public class Main {
    private List<Vehiculo> vehiculos;

    // Constructor
    public Main() {
        this.vehiculos = new ArrayList<>();
    }

    // Método para agregar vehículos
    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    // Método para buscar vehículos por año con filtro mayor o menor
    public List<Vehiculo> buscarPorAño(int año, boolean esMayor) {
        return vehiculos.stream()
                        .filter(vehiculo -> esMayor ? vehiculo.getAño() > año : vehiculo.getAño() < año)
                        .collect(Collectors.toList());
    }

    // Método para mostrar la lista de vehículos encontrados
    public void mostrarVehiculos(List<Vehiculo> vehiculos) {
        if (vehiculos.isEmpty()) {
            System.out.println("No se encontraron vehículos para el criterio especificado.");
        } else {
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println("Marca: " + vehiculo.getMarca() + 
                                   ", Modelo: " + vehiculo.getModelo() + 
                                   ", Año: " + vehiculo.getAño() + 
                                   ", Kilometraje: " + vehiculo.getKilometraje() + 
                                   ", Estado: " + vehiculo.getEstadoActual() + 
                                   ", Combustible: " + vehiculo.getTipoCombustible());
            }
        }
    }

    public static void main(String[] args) {
        // Crear instancia de Main
        Main main = new Main();

        // Agregar vehículos
        main.agregarVehiculo(new Vehiculo("Toyota", "Corolla", 2020, 15000, "Usado", "Gasolina"));
        main.agregarVehiculo(new Vehiculo("Honda", "Civic", 2019, 25000, "Nuevo", "Gasolina"));
        main.agregarVehiculo(new Vehiculo("Ford", "Focus", 2020, 12000, "Usado", "Diesel"));

        // Buscar vehículos mayores al año 2019
        List<Vehiculo> vehiculosMayores = main.buscarPorAño(2019, true);
        System.out.println("Vehículos mayores al año 2019:");
        main.mostrarVehiculos(vehiculosMayores);

        // Buscar vehículos menores al año 2020
        List<Vehiculo> vehiculosMenores = main.buscarPorAño(2020, false);
        System.out.println("Vehículos menores al año 2020:");
        main.mostrarVehiculos(vehiculosMenores);
    }
}

