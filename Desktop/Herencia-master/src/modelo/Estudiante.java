/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona {

    private int idEstudiante;
    private String numeroMatricula;
    private String jornada;
    private int idPersona;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String numeroMatricula, String jornada, int idPersona) {
        this.idEstudiante = idEstudiante;
        this.numeroMatricula = numeroMatricula;
        this.jornada = jornada;
        this.idPersona = idPersona;
    }

    public Estudiante(int idEstudiante, String numeroMatricula, String jornada, int idPersona, String nombres, String apellidos, String cedula, String direccion, String correoElectronico, String sexo, String fechaNacimiento, int telefono, String usuario, String clave) {
        super(idPersona, nombres, apellidos, cedula, direccion, correoElectronico, sexo, fechaNacimiento, telefono, usuario, clave);
        this.idEstudiante = idEstudiante;
        this.numeroMatricula = numeroMatricula;
        this.jornada = jornada;
        this.idPersona = idPersona;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String imprimir() {
        return "-------DATOS PERSONALES-----------\n"
                + "Id:" + getIdPersona() + "\n"
                + "Nombre:" + getNombres() + "\n"
                + "Apellidos:" + getApellidos() + "\n"
                + "Cédula:" + getCedula() + "\n"
                + "Dirección:" + getDireccion() + "\n"
                + "Correo Electrónico:" + getCorreoElectronico() + "\n"
                + "Fecha Nacimiento:" + getFechaNacimiento() + "\n"
                + "Sexo:" + getSexo() + "\n"
                + "Teléfono:" + getTelefono() + "\n"
                + "-------DATOS ESTUDIANTE------" + "\n"
                + "Id Estudiante:" + getIdEstudiante() + "\n"
                + "Numero de Matricula:" + getNumeroMatricula() + "\n"
                + "jornada:" + getJornada();
    }
}
