package model;

public class Vehiculo {
    // Atributos privados
    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;
    private String estadoActual;
    private Combustible tipoCombustible;

    // Constructor
    public Vehiculo(String marca, String modelo, int año, int kilometraje, String estadoActual,
            Combustible tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        this.estadoActual = estadoActual;
        this.tipoCombustible = tipoCombustible;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public Combustible getTipoCombustible() {
        return tipoCombustible;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public void setTipoCombustible(Combustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
