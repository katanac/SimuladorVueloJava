/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author KATANAC
 */
public class Helicoptero implements intefaces.IPiloteable{

    int idHelicoptero;
    String Nombre;
    int cantidadPuertas;
    int cantidadRotores;
    String tipoAvion;
    String tamaño;
    String marca;

    //propiedades del objeto helicoptero

    public int getIdHelicoptero() {
        return idHelicoptero;
    }

    public void setIdHelicoptero(int idHelicoptero) {
        this.idHelicoptero = idHelicoptero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadRotores() {
        return cantidadRotores;
    }

    public void setCantidadRotores(int cantidadRotores) {
        this.cantidadRotores = cantidadRotores;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
//metodos interface
    @Override
    public void Despegar(boolean tienePermiso) {
        if (tienePermiso) {
            System.out.println("tiene permiso para despegar");
        }else{
             System.out.println("no tiene permiso para despegar");
        }

    }

    @Override
    public void Aterrizar(boolean tienePermiso) {
      if (tienePermiso) {
            System.out.println("tiene permiso para aterrizar");
        }else{
             System.out.println("no tiene permiso para aterrizar");
        }
 }

    @Override
    public void Ascender(boolean tienePermiso) {
     if (tienePermiso) {
            System.out.println("tiene permiso para ascender");
        }else{
             System.out.println("no tiene permiso para ascender");
        }
}

    @Override
    public void Descender(boolean tienePermiso) {
      if (tienePermiso) {
            System.out.println("tiene permiso para descender");
        }else{
             System.out.println("no tiene permiso para descender");
        }
 }

    @Override
    public void girar(boolean tienePermiso) {
      if (tienePermiso) {
            System.out.println("tiene permiso para girar");
        }else{
             System.out.println("no tiene permiso para girar");
        }
}
    
}
