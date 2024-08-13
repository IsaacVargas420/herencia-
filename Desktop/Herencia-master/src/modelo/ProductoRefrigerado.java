/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class ProductoRefrigerado extends Producto {
    private String codigoOrganismo;
    private String fechaEnvasado;
    private double temperaturaRecomendada;
    
    public ProductoRefrigerado(){
     }
    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String paisOrigen, String codigoOrganismo, String fechaEnvasado, double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote, paisOrigen);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setTemperaturaRecomendada(double temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }


    public void imprimir() {
        super.imprimir();
        System.out.println("Código del Organismo de Supervisión Alimentaria: " + codigoOrganismo);
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
        System.out.println("Temperatura de Mantenimiento Recomendada: " + temperaturaRecomendada + "°C");
    }
    
}
