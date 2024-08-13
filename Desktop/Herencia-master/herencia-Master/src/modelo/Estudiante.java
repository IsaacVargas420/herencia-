/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PC19
 */
public class Estudiante extends Persona {

    private int idEstudiante;
    private int numeroMatricula;
    private String horario;
    private String jornada;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, int numeroMatricula, String horario, String jornada, int idPersona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectrinico, String sexo, String fecha_de_nacimiento) {
        super(idPersona, nombre, apellido, cedula, telefono, direccion, correoElectrinico, sexo, fecha_de_nacimiento);
        this.idEstudiante = idEstudiante;
        this.numeroMatricula = numeroMatricula;
        this.horario = horario;
        this.jornada = jornada;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    // Método de imprimir Estudiante
    public String imprimir() {
        return """
               --------DATOS DE ESTUDIANTE----------
               Id: """ + getIdPersona() + "\n"
                + "NOMBRE: " + getNombre() + "\n"
                + "APELLIDO: " + getApellido() + "\n"
                + "CEDULA: " + getCedula() + "\n"
                + "TELÉFONO: " + getTelefono() + "\n"
                + "DIRECCIÓN: " + getDireccion() + "\n"
                + "CORREO ELECTRÓNICO: " + getCorreoElectrinico() + "\n"
                + "SEXO: " + getSexo() + "\n"
                + "FECHA DE NACIMIENTO: " + getFecha_de_nacimiento() + "\n"
                + "ID ESTUDIANTE: " + idEstudiante + "\n"
                + "NÚMERO DE MATRÍCULA: " + numeroMatricula + "\n"
                + "HORARIO: " + horario + "\n"
                + "JORNADA: " + jornada + "\n";
    }
}
