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
public class ViajeFamiliar extends Viaje {

    /**
     * Cantidad de integrantes de la familia
     */
    private int familia;

    public ViajeFamiliar(String vorigen, String vdestino, int vcosto, Date vfechaini, Date vfechafin, int vfamilia) {
        origen = vorigen; //To change body of generated methods, choose Tools | Templates.
        destino = vdestino;
        costo = vcosto;
        fechaSalida = vfechaini;
        fechaLlegada = vfechafin;
        familia = vfamilia;
    }
    //Constructor getters and setters
    /**
     * Implementacion de la descripcion para el viaje familiar
     */
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }
    
    /**
     * Implementacion para cualquier Metodo heredado de la clase viaje
     */
    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
     /**
     * Asigna el valor de la familia dentro del parametro familia
     */
    void setFamilia(int vfamilia) {
        familia = vfamilia;
    }
    
     /**
     * Retorna el tamaño de la familia
     *@return devuelve el valor de la cantidad de miembros de la familia
     */

    int getFamilia() {
        return familia;
    }

}
