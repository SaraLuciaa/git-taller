import model.Vehiculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void printVehicles(Vehiculo[] vehicles) {
        for (Vehiculo vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}