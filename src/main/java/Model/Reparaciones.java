/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Jonatan
 */
public class Reparaciones {
    
    private String descripcion;
    private double costo;
    private Mecanico mecanico;

    public Reparaciones(String descripcion, double costo, Mecanico mecanico) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.mecanico = mecanico;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return descripcion + " | $" + costo + " | Mecánico: " + mecanico;
    }
    
}
