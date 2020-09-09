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
public class ViajeIncentivo extends Viaje {

    /**
     * Empresa que patrocina el viaje al empleado
     */
    private String empresa;

    public ViajeIncentivo(String vorigen, String vdestino, int vcosto, Date vfechaini, Date vfechafin, String vempresa) {
        origen = vorigen; //To change body of generated methods, choose Tools | Templates.
        destino = vdestino;
        costo = vcosto;
        fechaSalida = vfechaini;
        fechaLlegada = vfechafin;
        empresa = vempresa;
    }
    //Constructor, getters and setters

    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }

    String getEmpresa() {
        return empresa; //To change body of generated methods, choose Tools | Templates.
    }
}
