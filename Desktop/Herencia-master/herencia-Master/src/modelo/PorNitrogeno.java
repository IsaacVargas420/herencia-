/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class PorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicion;

    public PorNitrogeno(String fechaCaducidad, String numeroLote, String paisOrigen, String fechaEnvasado, double temperaturaRecomendada,
                                         String metodoCongelacion, int tiempoExposicion) {
        super(fechaCaducidad, numeroLote, paisOrigen, fechaEnvasado, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }


    public void imprimir() {
        super.imprimir();
        System.out.println("Método de Congelación: " + metodoCongelacion);
        System.out.println("Tiempo de Exposición al Nitrógeno: " + tiempoExposicion + " segundos");
    }
}