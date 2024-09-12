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

    // Método para buscar vehículos por año
    public List<Vehiculo> buscarPorRangoAño(int yearI, int yearF) {
        return vehiculos.stream()
                .filter(vehiculo -> vehiculo.getAño() >= yearI && vehiculo.getAño() <= yearF)
                .collect(Collectors.toList());
    }

    // Método para mostrar la lista de vehículos encontrados
    public void mostrarVehiculos(List<Vehiculo> vehiculos) {
        if (vehiculos.isEmpty()) {
            System.out.println("No se encontraron vehículos para el año especificado.");
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

        // Buscar vehículos por año
        List<Vehiculo> vehiculos2020 = main.buscarPorRangoAño(2015, 2016);


        // Mostrar vehículos encontrados
        main.mostrarVehiculos(vehiculos2020);
    }
}