/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

public class Docente extends Persona {
//declaraci de atrivutos
    private int idDocente;
    private String especializacion;
    private String titulo;
    private String tipo;
    private int rangosalarial;
//COSTRUCTOR VACIO
    public Docente() {
    }
    //CONSTRUCTOR CON ARGUMENTOS

    public Docente(int idDocente, String especializacion, String titulo, String tipo, int rangosalarial) {
        this.idDocente = idDocente;
        this.especializacion = especializacion;
        this.titulo = titulo;
        this.tipo = tipo;
        this.rangosalarial = rangosalarial;
    }
    
//CONSTRUCTOR CON ARGUMENTOS DE LA SUPER CLASE
    public Docente(int idPersona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectrinico, String sexo, String fecha_de_nacimiento,int idDocente, String especializacion, String titulo, String tipo, int rangosalarial) {
        super(idPersona, nombre, apellido, cedula, telefono, direccion, correoElectrinico, sexo, fecha_de_nacimiento);
        this.idDocente=idDocente;
        this.especializacion = especializacion;
        this.titulo = titulo;
        this.tipo = tipo;
        this.rangosalarial = rangosalarial;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRangosalarial() {
        return rangosalarial;
    }

    public void setRangosalarial(int rangosalarial) {
        this.rangosalarial = rangosalarial;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

  
   
public String imprimir() {
        return """
               --------DATOS DE DOCENTE----------
               Id: """ + getIdPersona() + "\n"
                + "NOMBRE: " + getNombre() + "\n"
                + "APELLIDO: " + getApellido() + "\n"
                + "CEDULA: " + getCedula() + "\n"
                + "TELÉFONO: " + getTelefono() + "\n"
                + "DIRECCIÓN: " + getDireccion() + "\n"
                + "CORREO ELECTRÓNICO: " + getCorreoElectrinico() + "\n"
                + "SEXO: " + getSexo() + "\n"
                + "FECHA DE NACIMIENTO: " + getFecha_de_nacimiento() + "\n"
                + "id: " + getIdDocente()+ "\n"
                + "ESPECIALIZACIÓN: " + getEspecializacion() + "\n"
                + "TÍTULO: " + getTitulo() + "\n"
                + "TIPO: " + getTipo() + "\n"
                + "RANGO SALARIAL: " + getRangosalarial() + "\n";
    }
}

