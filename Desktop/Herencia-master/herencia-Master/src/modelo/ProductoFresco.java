/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    
     public ProductoFresco(){
     }

    public ProductoFresco(String fechaCaducidad, String numeroLote, String paisOrigen, String fechaEnvasado) {
        super(fechaCaducidad, numeroLote, paisOrigen);
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }


    public void imprimir() {
        super.imprimir();
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
    }
}