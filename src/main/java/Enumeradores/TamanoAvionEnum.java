/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeradores;

/**
 *
 * @author KATANAC
 */
public enum TamanoAvionEnum {
    
    PEQUENO(0,"Pequeño"),
    MEDIANO(1,"Mediano"),
    GRANDE(2,"Grande");
    
    int tipoTamaño;
    String nombreTamano;
    
     TamanoAvionEnum(int tipoTamaño,String nombreTamano){
         this.tipoTamaño=tipoTamaño;
         this.nombreTamano=nombreTamano;
     }
     
     
    public int getTipoTamaño() {
        return tipoTamaño;
    }

    public String getNombreTamano() {
        return nombreTamano;
    }


    
     
}
