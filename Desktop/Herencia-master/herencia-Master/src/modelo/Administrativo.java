/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PC19
 */
public class Administrativo extends Persona {

    private int id;
    private String cargo;
    private String area;

    public Administrativo() {
    }

    public Administrativo(int idPersona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectrinico, String sexo, String fecha_de_nacimiento, int id, String cargo, String area) {
        super(idPersona, nombre, apellido, cedula, telefono, direccion, correoElectrinico, sexo, fecha_de_nacimiento);
        this.id = id;
        this.cargo = cargo;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // Método de impresión para Administrativo
    public String imprimir() {
        return """
               --------DATOS DE ADMINISTRATIVO----------
               Id: """ + getIdPersona() + "\n"
                + "NOMBRE: " + getNombre() + "\n"
                + "APELLIDO: " + getApellido() + "\n"
                + "CEDULA: " + getCedula() + "\n"
                + "TELÉFONO: " + getTelefono() + "\n"
                + "DIRECCIÓN: " + getDireccion() + "\n"
                + "CORREO ELECTRÓNICO: " + getCorreoElectrinico() + "\n"
                + "SEXO: " + getSexo() + "\n"
                + "FECHA DE NACIMIENTO: " + getFecha_de_nacimiento() + "\n"
                + "ID: " + id + "\n"
                + "CARGO: " + cargo + "\n"
                + "ÁREA: " + area + "\n";
    }
}
