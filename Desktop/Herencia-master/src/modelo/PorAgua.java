/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class PorAgua extends ProductoCongelado {
    private double salinidadAgua;

    public PorAgua(String fechaCaducidad, String numeroLote, String paisOrigen, String fechaEnvasado, double temperaturaRecomendada, double salinidadAgua) {
        super(fechaCaducidad, numeroLote, paisOrigen, fechaEnvasado, temperaturaRecomendada);
        this.salinidadAgua = salinidadAgua;
    }

    public void setSalinidadAgua(double salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }

    public double getSalinidadAgua() {
        return salinidadAgua;
    }

  
    public void imprimir() {
        super.imprimir();
        System.out.println("Salinidad del Agua: " + salinidadAgua + " gramos de sal por litro de agua");
    }
}
