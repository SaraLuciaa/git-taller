package model;
import java.util.Date;


public class HistorialMantenimiento {

    private Date fecha;
    private String descripcionServicio;
    private int kilometrajeEnServicio;
    private double costo;
    private String nombreMecanico;


    public HistorialMantenimiento(Date fecha, String descripcionServicio, int kilometrajeEnServicio, double costo, String nombreMecanico) {
        this.fecha = fecha;
        this.descripcionServicio = descripcionServicio;
        this.kilometrajeEnServicio = kilometrajeEnServicio;
        this.costo = costo;
        this.nombreMecanico = nombreMecanico;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public int getKilometrajeEnServicio() {
        return kilometrajeEnServicio;
    }

    public void setKilometrajeEnServicio(int kilometrajeEnServicio) {
        this.kilometrajeEnServicio = kilometrajeEnServicio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombreMecanico() {
        return nombreMecanico;
    }

    public void setNombreMecanico(String nombreMecanico) {
        this.nombreMecanico = nombreMecanico;
    }
}

