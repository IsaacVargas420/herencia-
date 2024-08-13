/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.CuentaAhorros;
import modelo.CuentaCorriente;


/**
 *
 * @author Usuario
 */
public class Main_Cuenta {

    public static void main(String[] args) {
//        Persona x=new Persona();
//        Docente d=new Docente() ;
//        d.setIdPersona(1);
//        d.setNombres("Gabriela");
//        d.setApellidos("Valladares");
//        d.setTitulo("Ingeniera en Sistemas Computacionales");
//        d.setEspecialidad("Backend");
//        d.setRegistroSenescyt("001-006-2016RX");
//        //System.out.println(d.imprimir());
//        //objeto administrativo 
//        Administrativo a=new Administrativo(2, "secretaria", "software", 1, "Paulina", "Jacome", "1234567891", "IBARRA", "p.jacome@ist17dejulio.edu.ec", "femenino", "11/06/1992", 987919912);
//        System.out.println(a.imprimir());
//        
//        Persona p=new Estudiante();

//        CuentaAhorros ca1=new CuentaAhorros(true, 18000, 0, 0, 12, 1.35);
//        for (int i = 0; i < 5; i++) {
//             ca1.retirar(1800);
//        }
//       ca1.calcularExtractoMensual();
//       
//       CuentaCorriente cc1=new CuentaCorriente(0, 12000, 0, 0, 0, 0);
//        cc1.imprimir();
//        System.out.println("RETIRANDO");
//        cc1.retiroCorriente(13000);
//        cc1.extractoMensual();
//        System.out.println("DEPOSITANDO");
//        cc1.depositoCorriente(2500);
//        cc1.imprimir();
//        System.out.println("RETIRANDO!!!");
//        cc1.retiroCorriente(500);
//        cc1.imprimir();
        ArrayList<CuentaAhorros> listaCuentaAhorro = new ArrayList<>();
        ArrayList<CuentaCorriente> listaCuentaCorriente = new ArrayList<>();
        Scanner es = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("BIENVENIDO AL BANCO PEPITO PÉREZ");
            System.out.println("Cuidando tu dinero desde 1992");
            System.out.println("""
                               Elija la opci\u00f3n que Usted requiera ejecutar:
                               1.Crear Cuenta
                               2.Consultar Saldo
                               3.Imprimir Estado de Cuenta
                               4.Dep\u00f3sitos
                               5.Retiros
                               0.Salir""");
            int op1 = es.nextInt();
            if (op1 == 1) {
                System.out.println("""
                                   Elija el tipo de Cuenta que quiere Crear
                                   1.Cuenta de Ahorros
                                   2.Cuenta Corriente""");
                int sm1 = es.nextInt();
                if (sm1 == 1 || sm1 == 2) {
                    if (sm1 == 1) {
                        System.out.println("---FORMULARIO DE CREACIÓN DE CUENTA DE AHORROS---");
                        System.out.println("Ingrese el monto de creación de la cuenta:");
                        double monto = es.nextDouble();
                        CuentaAhorros ca = new CuentaAhorros(false, monto, 1, 0, 12, 1.35);
                        listaCuentaAhorro.add(ca);
                        ca.imprimir();
                    } else if (sm1 == 2) {
                        System.out.println("---FORMULARIO DE CREACIÓN DE CUENTA CORRIENTE---");
                        System.out.println("Ingrese el monto de creación de la cuenta:");
                        double monto = es.nextDouble();
                        CuentaCorriente cc = new CuentaCorriente(0, monto, 1, 0, 12, 1.35);
                        listaCuentaCorriente.add(cc);
                        cc.imprimir();
                    }
                } else {
                    System.out.println("Ingrese una opción del menú");
                }
            }else if(op1==0){
                i=0;
            }

        } while (i == 1);
    }
}
