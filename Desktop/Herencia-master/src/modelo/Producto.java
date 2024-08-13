/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Producto {
    private String fechaCaducidad;
    private String numeroLote;
    private String paisOrigen;
   
    

    public Producto(){
     }
    public Producto(String fechaCaducidad, String numeroLote, String paisOrigen) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void imprimir() {
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
        System.out.println("Número de Lote: " + numeroLote);
        System.out.println("País de Origen: " + paisOrigen);
    }
}