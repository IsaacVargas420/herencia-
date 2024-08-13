/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class ProductoCongelado extends Producto {
    private String fechaEnvasado;
    private double temperaturaRecomendada;

        public ProductoCongelado(){
     }
    public ProductoCongelado(String fechaCaducidad, String numeroLote, String paisOrigen, String fechaEnvasado, double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote, paisOrigen);
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(double temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }



    public void imprimir() {
        super.imprimir();
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
        System.out.println("Temperatura de Mantenimiento Recomendada: " + temperaturaRecomendada + "°C");
    }
}