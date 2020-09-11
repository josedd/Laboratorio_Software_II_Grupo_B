/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Daniel Andres Agredo,Jose David Diaz
 */

public abstract class Viaje {

    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;
    // Constructores, getters y setters

     /**
     * Abstraccion que sera implementada luego por las clases hijas para describir el tipo de viaje
     */
    public abstract String descripcion();
    
     /**
     * Espacio para la implementacion de cualquier Metodo que se requiera para el viaje
     */
    public String cualquierMetodo() {
        return "Cualquier método implementado en la clase base";
    }
    
    /**
     * Espacio para la implementacion de cualquier Metodo  2 que se requiera para el viaje
     */
    public String cualquierMetodo2() {
        return "Cualquier método2 implementado en la clase base";
    }

    private void setSalida(Date vsalida) {
        fechaSalida = vsalida;
    }

    private void setLlegada(Date vllegada) {
        fechaLlegada = vllegada;
    }

    private void setCosto(int vcosto) {
        costo = vcosto;
    }

    private void setOrigen(String vorigen) {
        origen = vorigen;
    }

    private void setDestino(String vdestino) {
        destino = vdestino;
    }

    public String getOrigen() {
        return origen; //To change body of generated methods, choose Tools | Templates.
    }

    public String getDestino() {
        return destino; //To change body of generated methods, choose Tools | Templates.
    }

    public Date getFechaSalida() {
        return fechaSalida; //To change body of generated methods, choose Tools | Templates.
    }

    public Date getFechaLlegada() {
        return fechaLlegada; //To change body of generated methods, choose Tools | Templates.
    }

    public int getCosto() {
        return costo; //To change body of generated methods, choose Tools | Templates.
    }
}
