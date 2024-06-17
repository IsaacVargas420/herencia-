/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class Tienda {
    private String IVnombre;
    private String IVpropietario;
    private String IVidentificadorTributario;
    private List<Computadora> IVcomputadoras;

    public Tienda(String nombre, String propietario, String identificadorTributario) {
        this.IVnombre = nombre;
        this.IVpropietario = propietario;
        this.IVidentificadorTributario = identificadorTributario;
        this.IVcomputadoras = new ArrayList<>();
    }

    public void agregarComputadora(Computadora computadora) {
        this.IVcomputadoras.add(computadora);
    }

    public int contarComputadoras() {
        return this.IVcomputadoras.size();
    }

    public Computadora buscarComputadora(String marca) {
        for (Computadora computadora : this.IVcomputadoras) {
            if (computadora.getIVmarca().equals(marca)) {
                return computadora;
            }
        }
        return null;
    }

    public void listarComputadoras() {
        for (Computadora computadora : this.IVcomputadoras) {
            System.out.println("Marca: " + computadora.getIVmarca());
            System.out.println("Cantidad de memoria: " + computadora.getIVcantidadmemoria());
            System.out.println("Características del procesador: " + computadora.getIVcaracteristicasProcesador());
            System.out.println("Sistema operativo: " + computadora.getIVsistemaOperativo());
            System.out.println("Precio: " + computadora.getIVprecio());
            System.out.println();
        }
    }

    public String getIVnombre() {
        return this.IVnombre;
    }

    public String getIVpropietario() {
        return this.IVpropietario;
    }

    public String getIVidentificadorTributario() {
        return this.IVidentificadorTributario;
    }
}
