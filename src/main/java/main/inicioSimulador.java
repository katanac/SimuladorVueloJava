/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Enumeradores.TamanoAvionEnum;
import Enumeradores.TipoAeronaveEnum;
import clases.Avion;
import clases.Helicoptero;

/**
 *
 * @author KATANAC
 */
public class inicioSimulador {

    public static void main(String args[]) {
        inicioSimulador nuevoSimulador = new inicioSimulador();

        System.out.println("=============================================");
        System.out.println("----------SIMULADOR DE VUELOS KTPC-----------");
        System.out.println("=============================================");
        System.out.println(" ");

        nuevoSimulador.nuevoAvion1();

        System.out.println("=============================================");
        nuevoSimulador.nuevoAvion2();
        System.out.println("=============================================");
        nuevoSimulador.nuevoHelicoptero1();
        System.out.println("=============================================");
        nuevoSimulador.nuevoHelicoptero2();
        System.out.println("=============================================");

    }

    public void nuevoAvion1() {
        Avion avion1 = new Avion();
        avion1.setIdAvion(1111);
        avion1.setNombre("Avion pepito");
        avion1.setCantidadSillas(250);
        avion1.setMarca("Avianca");
        avion1.setTamaño(TamanoAvionEnum.MEDIANO.getNombreTamano());
        avion1.setTipoAvion(TipoAeronaveEnum.PASAJEROS.getNombreTipo());
        this.impresionAvionNuevo(avion1);
        this.permisosAvion2(avion1);

    }

    public void nuevoAvion2() {
        Avion avion2 = new Avion();
        avion2.setIdAvion(2222);
        avion2.setNombre("Avion pepita");
        avion2.setCantidadSillas(1000);
        avion2.setMarca("Avianca");
        avion2.setTamaño(TamanoAvionEnum.GRANDE.getNombreTamano());
        avion2.setTipoAvion(TipoAeronaveEnum.MILITAR.getNombreTipo());
        this.impresionAvionNuevo(avion2);
        this.permisosAvion2(avion2);
    }

    public void nuevoHelicoptero1() {
        Helicoptero helicoptero1 = new Helicoptero();
        helicoptero1.setIdHelicoptero(1111);
        helicoptero1.setNombre("helicoptero juanito");
        helicoptero1.setCantidadPuertas(2);
        helicoptero1.setCantidadRotores(4);
        helicoptero1.setMarca("ejercito");
        helicoptero1.setTamaño(TamanoAvionEnum.PEQUENO.getNombreTamano());
        helicoptero1.setTipoAvion(TipoAeronaveEnum.MILITAR.getNombreTipo());

        this.impresionHelicopteroNuevo(helicoptero1);
        this.permisosHelicoptero1(helicoptero1);

    }

    public void nuevoHelicoptero2() {
        Helicoptero helicoptero2 = new Helicoptero();
        helicoptero2.setIdHelicoptero(2222);
        helicoptero2.setNombre("helicoptero juanita");
        helicoptero2.setCantidadPuertas(4);
        helicoptero2.setCantidadRotores(3);
        helicoptero2.setMarca("periodismo");
        helicoptero2.setTamaño(TamanoAvionEnum.PEQUENO.getNombreTamano());
        helicoptero2.setTipoAvion(TipoAeronaveEnum.PASAJEROS.getNombreTipo());

        this.impresionHelicopteroNuevo(helicoptero2);
        this.permisosHelicoptero2(helicoptero2);

    }

    //permisor del simulador
    public void permisosAvion1(Avion avion1) {

        System.out.println("  ");
        System.out.println("cuenta con los sigueientes permisos:");
        System.out.println("  ");

        avion1.Aterrizar(true);
        avion1.Ascender(true);
        avion1.Despegar(false);
        avion1.Descender(false);
    }

    public void permisosAvion2(Avion avion2) {
        System.out.println("  ");
        System.out.println("cuenta con los sigueientes permisos:");
        System.out.println("  ");

        avion2.Aterrizar(false);
        avion2.Ascender(true);
        avion2.Despegar(false);
        avion2.Descender(true);
    }

    public void permisosHelicoptero1(Helicoptero helicopteroCreado) {
        System.out.println("  ");
        System.out.println("cuenta con los sigueientes permisos:");
        System.out.println("  ");

        helicopteroCreado.Aterrizar(true);
        helicopteroCreado.Ascender(false);
        helicopteroCreado.Despegar(true);
        helicopteroCreado.Descender(false);
    }

    public void permisosHelicoptero2(Helicoptero helicopteroCreado) {
        System.out.println("  ");
        System.out.println("cuenta con los sigueientes permisos:");
        System.out.println("  ");

        helicopteroCreado.Aterrizar(true);
        helicopteroCreado.Ascender(true);
        helicopteroCreado.Despegar(true);
        helicopteroCreado.Descender(true);
    }

    //impresion de nuevas aeronaves
    public void impresionAvionNuevo(Avion avionCreado) {
        System.out.println("el nuevo avion " + avionCreado.getIdAvion() + " tiene las siguientes carracteristicas:");
        System.out.println("  ");
        System.out.println("Id del avion: " + avionCreado.getIdAvion());
        System.out.println("Nombre: " + avionCreado.getNombre());
        System.out.println("Cantidad de sillas: " + avionCreado.getCantidadSillas());
        System.out.println("Tipo de Avion: " + avionCreado.getTipoAvion());
        System.out.println("Tamaño: " + avionCreado.getTamaño());
        System.out.println("Marca: " + avionCreado.getMarca());
    }

    public void impresionHelicopteroNuevo(Helicoptero helicopteroCreado) {
        System.out.println("el nuevo helicoptero " + helicopteroCreado.getIdHelicoptero() + " tiene las siguientes carracteristicas:");
        System.out.println("  ");
        System.out.println("Id del helicoptero: " + helicopteroCreado.getIdHelicoptero());
        System.out.println("Nombre: " + helicopteroCreado.getNombre());
        System.out.println("Cantidad de puertas:  " + helicopteroCreado.getCantidadPuertas());
        System.out.println("Cantidad de Rotones:  " + helicopteroCreado.getCantidadRotores());
        System.out.println("Tipo de Helicoptero: " + helicopteroCreado.getTipoAvion());
        System.out.println("Tamaño: " + helicopteroCreado.getTamaño());
        System.out.println("Marca: " + helicopteroCreado.getMarca());
    }
}
