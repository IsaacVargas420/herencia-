/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Docente extends Persona {
    //1.-ATRIBUTOS PROPIOS 
    private int idDocente;
    private String especialidad;
    private String titulo;
    private String registroSenescyt;
    private String escalaSalarial;
    private int idPersona;
    //2.-CONSTRUCTORES
    public Docente() {
    }

    public Docente(int idDocente, String especialidad, String titulo, String registroSenescyt, String escalaSalarial, int idPersona) {
        this.idDocente = idDocente;
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.registroSenescyt = registroSenescyt;
        this.escalaSalarial = escalaSalarial;
        this.idPersona = idPersona;
    }


    
    //CONSTRUCTOR SUPERCLASE

    public Docente(int idDocente, String especialidad, String titulo, String registroSenescyt, String escalaSalarial, int idPersona, String nombres, String apellidos, String cedula, String direccion, String correoElectronico, String sexo, String fechaNacimiento, int telefono, String usuario, String clave) {
        super(idPersona, nombres, apellidos, cedula, direccion, correoElectronico, sexo, fechaNacimiento, telefono, usuario, clave);
        this.idDocente = idDocente;
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.registroSenescyt = registroSenescyt;
        this.escalaSalarial = escalaSalarial;
        this.idPersona = idPersona;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRegistroSenescyt() {
        return registroSenescyt;
    }

    public void setRegistroSenescyt(String registroSenescyt) {
        this.registroSenescyt = registroSenescyt;
    }

    public String getEscalaSalarial() {
        return escalaSalarial;
    }

    public void setEscalaSalarial(String escalaSalarial) {
        this.escalaSalarial = escalaSalarial;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    
    public String imprimir() {
        return "-------DATOS PERSONA-----------\n"
                + "Id:" + getIdPersona() + "\n"
                + "Nombre:" + getNombres() + "\n"
                + "Apellidos:" + getApellidos() + "\n"
                + "Cédula:" + getCedula() + "\n"
                + "Dirección:" + getDireccion() + "\n"
                + "Correo Electrónico:" + getCorreoElectronico()+ "\n"
                +"Fecha Nacimiento:"+getFechaNacimiento()+ "\n"
                +"Sexo:"+getSexo()+ "\n"
                +"Teléfono:"+getTelefono()+"\n"
                +"-------DATOS DOCENTES------------\n"+
                "Id Docente:"+getIdDocente()+ "\n"
                +"Especialidad;"+getEspecialidad()+ "\n"
                +"Título:"+getTitulo()+ "\n"
                +"Registro Senescyt:"+getRegistroSenescyt()+ "\n"
                +"Escala Salarial:"+getEscalaSalarial();

    }

   
}
