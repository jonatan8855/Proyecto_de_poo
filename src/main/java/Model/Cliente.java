/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

/**
 *
 * @author Jonatan
 */
public class Cliente {

     protected String nombre;
    protected String cedula;
    protected String telefono;

    public Cliente(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public double pagar(double valor) {
        // El cliente normal paga el valor completo
        return valor;
    }

    @Override
    public String toString() {
        return nombre + " | Cédula: " + cedula + " | Tel: " + telefono;
    }
}
