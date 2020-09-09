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
public class ViajeIndividual extends Viaje {

    public ViajeIndividual(String vorigen, String vdestino, int vcosto, Date vfechaini, Date vfechafin) {
        origen = vorigen; //To change body of generated methods, choose Tools | Templates.
        destino = vdestino;
        costo = vcosto;
        fechaSalida = vfechaini;
        fechaLlegada = vfechafin;
    }
    // Constructor

    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
    //No se sobreescribe cualquierMetodo2()
}
