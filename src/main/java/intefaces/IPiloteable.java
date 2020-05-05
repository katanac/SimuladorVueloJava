/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefaces;

/**
 *
 * @author KATANAC
 */
public interface IPiloteable {

    void Despegar(boolean tienePermiso);

    void Aterrizar(boolean tienePermiso);

    void Ascender(boolean tienePermiso);

    void Descender(boolean tienePermiso);

    void girar(boolean tienePermiso);

}
