/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
public class Computadora {
    private String IVmarca;
    private int IVcantidadmemoria;
    private String IVcaracteristicasProcesador;
    private String IVsistemaOperativo;
    private double IVprecio;

    // Constructor
    public Computadora(String marca, int cantidadMemoria, String caracteristicasProcesador, String sistemaOperativo, double precio) {
        this.IVmarca = marca;
        this.IVcantidadmemoria = cantidadMemoria;
        this.IVcaracteristicasProcesador = caracteristicasProcesador;
        this.IVsistemaOperativo = sistemaOperativo;
        this.IVprecio = precio;
    }

    // Getters y Setters
    public String getIVmarca() {
        return IVmarca;
    }

    public void setIVmarca(String IVmarca) {
        this.IVmarca = IVmarca;
    }

    public int getIVcantidadmemoria() {
        return IVcantidadmemoria;
    }

    public void setIVcantidadmemoria(int IVcantidadmemoria) {
        this.IVcantidadmemoria = IVcantidadmemoria;
    }

    public String getIVcaracteristicasProcesador() {
        return IVcaracteristicasProcesador;
    }

    public void setIVcaracteristicasProcesador(String IVcaracteristicasProcesador) {
        this.IVcaracteristicasProcesador = IVcaracteristicasProcesador;
    }

    public String getIVsistemaOperativo() {
        return IVsistemaOperativo;
    }

    public void setIVsistemaOperativo(String IVsistemaOperativo) {
        this.IVsistemaOperativo = IVsistemaOperativo;
    }

    public double getIVprecio() {
        return IVprecio;
    }

    public void setIVprecio(double IVprecio) {
        this.IVprecio = IVprecio;
    }
}