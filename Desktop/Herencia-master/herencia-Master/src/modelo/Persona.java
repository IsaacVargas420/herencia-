/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * 
 */
public class Persona {

    // 1.- Atributos públicos
    private int idPersona;
    private String nombre;
    private String apellido;
    private String cedula;
    private int telefono;
    private String direccion;
    private String correoElectrinico;
   private String sexo;
    private String fecha_de_nacimiento;

    // 2.- Constructores
    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectrinico, String sexo, String fecha_de_nacimiento) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectrinico = correoElectrinico;
        this.sexo = sexo;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    // Métodos getters y setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectrinico() {
        return correoElectrinico;
    }

    public void setCorreoElectrinico(String correoElectrinico) {
        this.correoElectrinico = correoElectrinico;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    // 4.- Método de reglas de negocio
    public String imprimir() {
        return "--------DATOS DE PERSONA----------\n"
                + "Id: " + getIdPersona() + "\n"
                + "NOMBRE: " + getNombre() + "\n"
                + "APELLIDO: " + getApellido() + "\n"
                + "CEDULA: " + getCedula() + "\n"
                + "TELÉFONO: " + getTelefono() + "\n"
                + "DIRECCIÓN: " + getDireccion() + "\n"
                + "CORREO ELECTRÓNICO: " + getCorreoElectrinico() + "\n"
                + "SEXO: " + getSexo() + "\n"
                + "FECHA DE NACIMIENTO: " + getFecha_de_nacimiento() + "\n";
    }
}
