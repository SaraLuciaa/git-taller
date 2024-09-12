import model.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Combustible;
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
    // Método para buscar vehículos por año
    public List<Vehiculo> buscarPorRangoAño(int yearI, int yearF) {
        return vehiculos.stream()
                .filter(vehiculo -> vehiculo.getAño() >= yearI && vehiculo.getAño() <= yearF)
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
        main.agregarVehiculo(new Vehiculo("Toyota", "Corolla", 2020, 15000, "Usado", Combustible.ELECTRICO, 150));
        main.agregarVehiculo(new Vehiculo("Honda", "Civic", 2019, 25000, "Nuevo", Combustible.ELECTRICO, 150));
        main.agregarVehiculo(new Vehiculo("Ford", "Focus", 2020, 12000, "Usado", Combustible.ELECTRICO, 150));

<<<<<<< HEAD
        // Buscar vehículos mayores al año 2019
        List<Vehiculo> vehiculosMayores = main.buscarPorAño(2019, true);
        System.out.println("Vehículos mayores al año 2019:");
        main.mostrarVehiculos(vehiculosMayores);
=======
        // Buscar vehículos por año
        List<Vehiculo> vehiculos2020 = main.buscarPorRangoAño(2015, 2016);

>>>>>>> dfb34b37a3801c5010d8272966e23aec8315755a

        // Buscar vehículos menores al año 2020
        List<Vehiculo> vehiculosMenores = main.buscarPorAño(2020, false);
        System.out.println("Vehículos menores al año 2020:");
        main.mostrarVehiculos(vehiculosMenores);
    }
}

