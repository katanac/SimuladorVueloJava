/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeradores;

/**
 *
 * @author Karen Tatiana Peña Cortes
 */
public enum TipoAeronaveEnum {

    CARGA(0, "Carga"),
    PASAJEROS(1, "Pasajeros"),
    MILITAR(2, "Militar");

    int tipoAvion;
    String nombreTipo;

    
    TipoAeronaveEnum(int tipoAvion, String nombreTipo) {
        this.tipoAvion = tipoAvion;
        this.nombreTipo = nombreTipo;
    }

    
    public int getTipoAvion() {
        return tipoAvion;
    }


    public String getNombreTipo() {
        return nombreTipo;
    }


}
