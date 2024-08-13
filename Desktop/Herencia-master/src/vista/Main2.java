/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.AdministrativoControlador;
import controlador.DocenteControlador;
import controlador.EstudianteControlador;
import controlador.PersonaControlador;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Administrativo;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Persona;

/**
 *
 * @author Usuario
 */
public class Main2 {

    public static void main(String[] args) {
        ArrayList<CuentaAhorros> listaCuentaAhorro = new ArrayList<>();
        ArrayList<CuentaCorriente> listaCuentaCorriente = new ArrayList<>();
        Scanner es = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("BIENVENIDO AL BANCO PEPITO PÉREZ");
            System.out.println("Cuidando tu dinero desde 1992");
            System.out.println("Elija la opción que Usted requiera ejecutar:\n"
                    + "1.Crear Cuenta\n"
                    + "2.Consultar Saldo\n"
                    + "3.Imprimir Estado de Cuenta\n"
                    + "4.Depósitos\n"
                    + "5.Retiros\n"
                    + "6.Gestión de Usuarios\n"
                    + "0.Salir");
            int op1 = es.nextInt();
            if (op1 == 1) {
                System.out.println("Elija el tipo de Cuenta que quiere Crear\n"
                        + "1.Cuenta de Ahorros\n"
                        + "2.Cuenta Corriente");
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
            } else if (op1 == 0) {
                i = 0;
            } else if (op1 == 6) {
                System.out.println("Elija la transacción a realizar\n"
                        + "1.Crear Persona\n"
                        + "2.Crear Estudiante\n"
                        + "3.Crear Administrativo\n"
                        + "4.Crear Docente\n"
                        + "5.Mostrar Listado de Personas\n"
                        + "6.Actualizar datos Personas\n"
                        + "7.Eliminar Persona");
                int mp = es.nextInt();
                if (mp == 1) {
                    System.out.println("Ingrese los siguientes datos informativos");
                    //MODELO
                    Persona p = new Persona();
                    System.out.println("Ingrese su Nombre:");
                    p.setNombres(es.next());
                    System.out.println("Ingrese su Apellidos:");
                    p.setApellidos(es.next());
                    System.out.println("Ingrese su número de cédula:");
                    p.setCedula(es.next());
                    System.out.println("Ingrese un Usuario:");
                    p.setUsuario(es.next());
                    System.out.println("Ingrese una Clave:");
                    p.setClave(es.next());
                    System.out.println("Ingrese una Dirección:");
                    p.setDireccion(es.next());
                    System.out.println("Ingrese su Correo Electrónico:");
                    p.setCorreoElectronico(es.next());
                    System.out.println("Ingrese el sexo:");
                    p.setSexo(es.next());
                    System.out.println("Ingrese su Fecha de Nacimiento:");
                    p.setFechaNacimiento(es.next());
                    System.out.println("Ingrese un número Telefónico:");
                    p.setTelefono(es.nextInt());
                    //CONTROLADOR
                    PersonaControlador pc = new PersonaControlador();
                    pc.crearPersona(p);
                } else if (mp == 2) {
                    System.out.println("Ingrese los siguientes datos personales");
                    //MODELO DE LA SUPER CLASE
                    Persona p = new Persona();

                    System.out.println("Ingrese su Nombre:");
                    p.setNombres(es.next());
                    System.out.println("Ingrese su Apellidos:");
                    p.setApellidos(es.next());
                    System.out.println("Ingrese su número de cédula:");
                    p.setCedula(es.next());
                    System.out.println("Ingrese un Usuario:");
                    p.setUsuario(es.next());
                    System.out.println("Ingrese una Clave:");
                    p.setClave(es.next());
                    System.out.println("Ingrese una Dirección:");
                    p.setDireccion(es.next());
                    System.out.println("Ingrese su Correo Electrónico:");
                    p.setCorreoElectronico(es.next());
                    System.out.println("Ingrese el sexo:");
                    p.setSexo(es.next());
                    System.out.println("Ingrese su Fecha de Nacimiento:");
                    p.setFechaNacimiento(es.next());
                    System.out.println("Ingrese un número Telefónico:");
                    p.setTelefono(es.nextInt());
                    //CONTROLADOR
                    PersonaControlador pc = new PersonaControlador();
                    pc.crearPersona(p);
                    System.out.println("Ingrese los siguientes datos estudiantiles");
                    //OBTENER EL ID DE LA TABLA PERSONAS (SUPER CLASE)
                    int idPersona = pc.buscarIdPersona(p.getCedula());
                    System.out.println("-------------------" + idPersona);
                    //MODELO DE LA SUBCLASE   
                    Estudiante est = new Estudiante();
                    System.out.println("Ingrese el número de matrícula:");
                    est.setNumeroMatricula(es.next());
                    System.out.println("Ingrese su jornada de estudio:");
                    est.setJornada(es.next());
                    est.setIdPersona(idPersona);

                    EstudianteControlador estC = new EstudianteControlador();
                    estC.crearEstudiante(est);

                } else if (mp == 3) {
                    System.out.println("Ingrese los siguientes datos personales");
                    //MODELO DE LA SUPER CLASE
                    Persona p = new Persona();

                    System.out.println("Ingrese su Nombre:");
                    p.setNombres(es.next());
                    System.out.println("Ingrese su Apellidos:");
                    p.setApellidos(es.next());
                    System.out.println("Ingrese su número de cédula:");
                    p.setCedula(es.next());
                    System.out.println("Ingrese un Usuario:");
                    p.setUsuario(es.next());
                    System.out.println("Ingrese una Clave:");
                    p.setClave(es.next());
                    System.out.println("Ingrese una Dirección:");
                    p.setDireccion(es.next());
                    System.out.println("Ingrese su Correo Electrónico:");
                    p.setCorreoElectronico(es.next());
                    System.out.println("Ingrese el sexo:");
                    p.setSexo(es.next());
                    System.out.println("Ingrese su Fecha de Nacimiento:");
                    p.setFechaNacimiento(es.next());
                    System.out.println("Ingrese un número Telefónico:");
                    p.setTelefono(es.nextInt());
                    //CONTROLADOR
                    PersonaControlador pc = new PersonaControlador();
                    pc.crearPersona(p);
                    System.out.println("Ingrese los siguientes datos estudiantiles");
                    //OBTENER EL ID DE LA TABLA PERSONAS (SUPER CLASE)
                    int idPersona = pc.buscarIdPersona(p.getCedula());
                    System.out.println("-------------------" + idPersona);
                    //MODELO DE LA SUBCLASE   
                    Administrativo ad = new Administrativo();
                    System.out.println("Ingrese el cargo:");
                    ad.setCargo(es.next());
                    System.out.println("Ingrese su área de trabajo:");
                    ad.setArea(es.next());

                    AdministrativoControlador adC = new AdministrativoControlador();
                    adC.crearAdministrativo(ad, idPersona);

                } else if (mp == 4) {
                    System.out.println("Ingrese los siguientes datos personales");
                    //MODELO DE LA SUPER CLASE
                    Persona p = new Persona();

                    System.out.println("Ingrese su Nombre:");
                    p.setNombres(es.next());
                    System.out.println("Ingrese su Apellidos:");
                    p.setApellidos(es.next());
                    System.out.println("Ingrese su número de cédula:");
                    p.setCedula(es.next());
                    System.out.println("Ingrese un Usuario:");
                    p.setUsuario(es.next());
                    System.out.println("Ingrese una Clave:");
                    p.setClave(es.next());
                    System.out.println("Ingrese una Dirección:");
                    p.setDireccion(es.next());
                    System.out.println("Ingrese su Correo Electrónico:");
                    p.setCorreoElectronico(es.next());
                    System.out.println("Ingrese el sexo:");
                    p.setSexo(es.next());
                    System.out.println("Ingrese su Fecha de Nacimiento:");
                    p.setFechaNacimiento(es.next());
                    System.out.println("Ingrese un número Telefónico:");
                    p.setTelefono(es.nextInt());
                    //CONTROLADOR
                    PersonaControlador pc = new PersonaControlador();
                    pc.crearPersona(p);
                    System.out.println("Ingrese los siguientes datos de Docente");
                    //OBTENER EL ID DE LA TABLA PERSONAS (SUPER CLASE)
                    int idPersona = pc.buscarIdPersona(p.getCedula());
                    System.out.println("-------------------" + idPersona);
                    //MODELO DE LA SUBCLASE   
                    Docente d = new Docente();
                    System.out.println("Ingrese su especialidad:");
                    d.setEspecialidad(es.next());
                    System.out.println("Ingrese su título:");
                    d.setTitulo(es.next());
                    System.out.println("Ingrese su registro del Senescyt:");
                    d.setRegistroSenescyt(es.next());
                    System.out.println("Ingrese la escala Salarial:");
                    d.setEscalaSalarial(es.next());
                    d.setIdPersona(idPersona);

                    DocenteControlador dc = new DocenteControlador();
                    dc.crearDocente(d);
                } else if (mp == 5) {
                    PersonaControlador pC = new PersonaControlador();
                    ArrayList<Persona> listaPersonas = pC.listarPersonas();
                    for (Persona l : listaPersonas) {
                        System.out.println(l.imprimir());
                    }

                } else if (mp == 6) {
                    System.out.println("Ingrese su actual número de cédula:");
                    String cedula = es.next();
                    PersonaControlador pc = new PersonaControlador();
                    Persona p1 = pc.buscarDatosPersona(cedula);
                    System.out.println(p1.imprimir());

                    System.out.println("Ingrese los siguientes datos a cambiar");
                    //MODELO DE LA SUPER CLASE
                    Persona p = new Persona();

                    System.out.println("Ingrese el nuevo Nombre:");
                    p.setNombres(es.next());
                    System.out.println("Ingrese el nuevo número de cédula:");
                    p.setCedula(es.next());
                    pc.actualizarPersonas(p, cedula);
                    //CONTROLADOR

                    pc.actualizarPersonas(p, cedula);
                }else if(mp==7){
                    System.out.println("Ingrese el número de cédula de la persona a eliminar:");
                    String cedula = es.next();
                    PersonaControlador pc = new PersonaControlador();
                    pc.eliminarPersonas(cedula);
                }

            }

        } while (i == 1);
    }
}
