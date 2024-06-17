/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Computadora;
import modelo.Tienda;

/**
 *
 * @author Asus
 */
public class TiendaController {
    private Tienda tienda;

    public TiendaController(Tienda tienda) {
        this.tienda = tienda;
    }

    public void agregarComputadora(Computadora computadora) {
        tienda.agregarComputadora(computadora);
    }

    public int contarComputadoras() {
        return tienda.contarComputadoras();
    }

    public Computadora buscarComputadora(String marca) {
        return tienda.buscarComputadora(marca);
    }

    public void listarComputadoras() {
        tienda.listarComputadoras();
    }

    public String getNombreTienda() {
        return tienda.getIVnombre();
    }

    public String getPropietario() {
        return tienda.getIVpropietario();
    }

    public String getIdentificadorTributario() {
        return tienda.getIVidentificadorTributario();
    }
}
