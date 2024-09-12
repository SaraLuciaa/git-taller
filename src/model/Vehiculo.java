package model;

public class Vehiculo {
    // Atributos privados
    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;
    private String estadoActual;
    private Combustible tipoCombustible;
    private int potencia;
    private String color;

    // Constructor
    public Vehiculo(String marca, String modelo, int año, int kilometraje, String estadoActual,
            Combustible tipoCombustible, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        this.estadoActual = estadoActual;
        this.tipoCombustible = tipoCombustible;
        this.potencia = potencia;
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

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAño: " + año + "\nKilometraje: " + kilometraje + "\nEstado actual: " + estadoActual + "\nTipo de combustible: " + tipoCombustible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    
}