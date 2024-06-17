/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.TiendaController;
import modelo.Computadora;
import modelo.Tienda;


/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos de la tienda
        System.out.print("Ingrese el nombre de la tienda: ");
        String nombreTienda = scanner.nextLine();
        System.out.print("Ingrese el nombre del propietario: ");
        String propietario = scanner.nextLine();
        System.out.print("Ingrese el identificador tributario: ");
        String identificadorTributario = scanner.nextLine();

        Tienda tienda = new Tienda(nombreTienda, propietario, identificadorTributario);
        TiendaController controller = new TiendaController(tienda);

        // Pedir datos de las computadoras
        System.out.print("¿Cuántas computadoras desea agregar? ");
        int numComputadoras = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < numComputadoras; i++) {
            System.out.println("Computadora " + (i + 1) + ":");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Cantidad de memoria (GB): ");
            int cantidadMemoria = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            System.out.print("Características del procesador: ");
            String caracteristicasProcesador = scanner.nextLine();
            System.out.print("Sistema operativo: ");
            String sistemaOperativo = scanner.nextLine();
            System.out.print("Precio: ");
            String precioStr = scanner.nextLine();
            double precio = Double.parseDouble(precioStr);

            Computadora computadora = new Computadora(marca, cantidadMemoria, caracteristicasProcesador, sistemaOperativo, precio);
            controller.agregarComputadora(computadora);
        }

        // Mostrar información de la tienda y las computadoras
        System.out.println("\nInformación de la tienda:");
        System.out.println("Nombre: " + controller.getNombreTienda());
        System.out.println("Propietario: " + controller.getPropietario());
        System.out.println("Identificador tributario: " + controller.getIdentificadorTributario());
        System.out.println("Número de computadoras: " + controller.contarComputadoras());

        System.out.println("\nLista de computadoras:");
        controller.listarComputadoras();
    }
}
