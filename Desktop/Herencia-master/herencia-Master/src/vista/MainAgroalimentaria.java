/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.PorAgua;
import modelo.PorAire;
import modelo.PorNitrogeno;
import modelo.ProductoFresco;
import modelo.ProductoRefrigerado;

public class MainAgroalimentaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");
        System.out.println("BIENVENIDO A LA GESTIÓN DE PRODUCTOS AGROALIMENTARIOS TR  ♥ ♥");
        System.out.println(" ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");

        System.out.println("Ingrese los datos del Producto Fresco:");
        System.out.print("Fecha de caducidad (AAAA-MM-DD): ");
        String fechaCaducidadFresco = scanner.nextLine();
        System.out.print("Número de lote: ");
        String numeroLoteFresco = scanner.nextLine();
        System.out.print("País de origen: ");
        String paisOrigenFresco = scanner.nextLine();
        System.out.print("Fecha de envasado (AAAA-MM-DD): ");
        String fechaEnvasadoFresco = scanner.nextLine();
System.out.println(" ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");
        ProductoFresco fresco = new ProductoFresco(fechaCaducidadFresco, numeroLoteFresco, paisOrigenFresco, fechaEnvasadoFresco);

        System.out.println("\nIngrese los datos del Producto Refrigerado:");
        System.out.print("Fecha de caducidad (AAAA-MM-DD): ");
        String fechaCaducidadRefrigerado = scanner.nextLine();
        System.out.print("Número de lote: ");
        String numeroLoteRefrigerado = scanner.nextLine();
        System.out.print("País de origen: ");
        String paisOrigenRefrigerado = scanner.nextLine();
        System.out.print("Código del organismo de supervisión alimentaria: ");
        String codigoOrganismoRefrigerado = scanner.nextLine();
        System.out.print("Fecha de envasado (AAAA-MM-DD): ");
        String fechaEnvasadoRefrigerado = scanner.nextLine();
        System.out.print("Temperatura de mantenimiento recomendada (°C): ");
        double temperaturaRefrigerado = scanner.nextDouble();
System.out.println(" ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");
        ProductoRefrigerado refrigerado = new ProductoRefrigerado(fechaCaducidadRefrigerado, numeroLoteRefrigerado, paisOrigenRefrigerado,
                codigoOrganismoRefrigerado, fechaEnvasadoRefrigerado, temperaturaRefrigerado);

        System.out.println("\nIngrese los datos del Producto Congelado por Aire:");
        System.out.print("Fecha de caducidad (AAAA-MM-DD): ");
        String fechaCaducidadCongeladoAire = scanner.next();
        System.out.print("Número de lote: ");
        String numeroLoteCongeladoAire = scanner.next();
        System.out.print("País de origen: ");
        String paisOrigenCongeladoAire = scanner.next();
        System.out.print("Fecha de envasado (AAAA-MM-DD): ");
        String fechaEnvasadoCongeladoAire = scanner.next();
        System.out.print("Temperatura de mantenimiento recomendada (°C): ");
        double temperaturaCongeladoAire = scanner.nextDouble();
        System.out.print("Porcentaje de nitrógeno: ");
        double porcentajeN2 = scanner.nextDouble();
        System.out.print("Porcentaje de oxígeno: ");
        double porcentajeO2 = scanner.nextDouble();
        System.out.print("Porcentaje de dióxido de carbono: ");
        double porcentajeCO2 = scanner.nextDouble();
        System.out.print("Porcentaje de vapor de agua: ");
        double porcentajeH2O = scanner.nextDouble();
System.out.println(" ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");
        PorAire congeladoAire = new PorAire(fechaCaducidadCongeladoAire, numeroLoteCongeladoAire, paisOrigenCongeladoAire,
                fechaEnvasadoCongeladoAire, temperaturaCongeladoAire, porcentajeN2, porcentajeO2, porcentajeCO2, porcentajeH2O);

        scanner.nextLine(); 

        System.out.println("\nIngrese los datos del Producto Congelado por Agua:");
        System.out.print("Fecha de caducidad (AAAA-MM-DD): ");
        String fechaCaducidadCongeladoAgua = scanner.nextLine();
        System.out.print("Número de lote: ");
        String numeroLoteCongeladoAgua = scanner.nextLine();
        System.out.print("País de origen: ");
        String paisOrigenCongeladoAgua = scanner.nextLine();
        System.out.print("Fecha de envasado (AAAA-MM-DD): ");
        String fechaEnvasadoCongeladoAgua = scanner.nextLine();
        System.out.print("Temperatura de mantenimiento recomendada (°C): ");
        double temperaturaCongeladoAgua = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Salinidad del agua (g/L): ");
        double salinidadAgua = scanner.nextDouble();
System.out.println(" ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");
       PorAgua congeladoAgua = new PorAgua(fechaCaducidadCongeladoAgua, numeroLoteCongeladoAgua, paisOrigenCongeladoAgua,
                fechaEnvasadoCongeladoAgua, temperaturaCongeladoAgua, salinidadAgua);

        System.out.println("\nIngrese los datos del Producto Congelado por Nitrógeno:");
        System.out.print("Fecha de caducidad (AAAA-MM-DD): ");
        String fechaCaducidadCongeladoNitrogeno = scanner.next();
        System.out.print("Número de lote: ");
        String numeroLoteCongeladoNitrogeno = scanner.next();
        System.out.print("País de origen: ");
        String paisOrigenCongeladoNitrogeno = scanner.next();
        System.out.print("Fecha de envasado (AAAA-MM-DD): ");
        String fechaEnvasadoCongeladoNitrogeno = scanner.next();
        System.out.print("Temperatura de mantenimiento recomendada (°C): ");
        double temperaturaCongeladoNitrogeno = scanner.nextDouble();
        System.out.print("Método de congelación: ");
        String metodoCongelacion = scanner.next();
        System.out.print("Tiempo de exposición al nitrógeno (segundos): ");
        int tiempoExposicion = scanner.nextInt();
System.out.println(" ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");
        PorNitrogeno congeladoNitrogeno = new PorNitrogeno(fechaCaducidadCongeladoNitrogeno, numeroLoteCongeladoNitrogeno,
                paisOrigenCongeladoNitrogeno, fechaEnvasadoCongeladoNitrogeno, temperaturaCongeladoNitrogeno, metodoCongelacion, tiempoExposicion);

 System.out.println(" ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");       
        // información de los productos creados
        System.out.println("\nINFORMACIÓN DE LOS PRODUCTOS AGROALIMENTARIOS TR CREADOS:");
        System.out.println(" ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");
        System.out.println("Producto Fresco:");
        fresco.imprimir();
        System.out.println("\nProducto Refrigerado:");
        refrigerado.imprimir();
        System.out.println("\nProducto Congelado por Aire:");
        congeladoAire.imprimir();
        System.out.println("\nProducto Congelado por Agua:");
        congeladoAgua.imprimir();
        System.out.println("\nProducto Congelado por Nitrógeno:");
        congeladoNitrogeno.imprimir();
    }
}
