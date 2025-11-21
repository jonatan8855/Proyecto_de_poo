/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Jonatan
 */
public class Membresia {
    
    private String tipo;      // BRONCE, PLATA, ORO
    private double descuento; // entre 0 y 1
    private final String descripcion;

    public Membresia(String tipo, double descuento) {
        this.tipo = tipo;
        this.descripcion = tipo;
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Membresía: " + tipo + " (" + (descuento * 100) + "% desc)";
    }
    
    
}
