/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Jonatan
 */
public class Vehiculo {
    
    private String placa;
    private String marca;
    private int modelo;
    private Cliente propietario;

    public Vehiculo(String placa, String marca, int modelo, Cliente propietario) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return placa + " - " + marca + " (" + modelo + ") | Prop: " + propietario.nombre;
    }
    
}
