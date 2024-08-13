/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Persona {

    //1.ATRIBUTOS
    private int idPersona;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String correoElectronico;
    private String sexo;
    private String fechaNacimiento;
    private int telefono;
    private String usuario;
    private String clave;
    
    //2.MÉTODOS CONSTRUCTORES 

    public Persona() {
    }

    public Persona(int idPersona, String nombres, String apellidos, String cedula, String direccion, String correoElectronico, String sexo, String fechaNacimiento, int telefono, String usuario, String clave) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.usuario = usuario;
        this.clave = clave;
    }

      

    //3. ENCAPSULAMIENTO
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

   

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    

    //4. MÉTODOS DE REGLA DE NEGOCIO
    public String imprimir() {
        return "-------DATOS PERSONALES-----------\n"
                + "Id:" + getIdPersona() + "\n"
                + "Nombre:" + getNombres() + "\n"
                + "Apellidos:" + getApellidos() + "\n"
                + "Cédula:" + getCedula() + "\n"
                + "Dirección:" + getDireccion() + "\n"
                + "Usuario:" + getUsuario()+ "\n"
                + "Clave:" + "***************"+ "\n"
                + "Correo Electrónico:" + getCorreoElectronico()+ "\n"
                +"Fecha Nacimiento:"+getFechaNacimiento()+ "\n"
                +"Sexo:"+getSexo()+ "\n"
                +"Teléfono:"+getTelefono();

    }

    //método de validación cédula exista
    public void validarCedula() {
        int[] listaDigitos = new int[9];
        int[] listaPares = new int[9];
        int[] listaImparas = new int[9];
        int totalImpares = 0;
        int impares=0;
        int totalPares = 0;
        int sumTotal = 0;
        String cedula = this.getCedula();
        int ultimoDigito = cedula.charAt(9) - '0';
       // System.out.println("-------" + ultimoDigito);
        if (cedula.length() > 10) {
            System.out.println("Ingrese una cédula válida");
        } else if (cedula.length() == 10) {
            for (int i = 0; i < cedula.length() - 1; i++) {
                listaDigitos[i] = cedula.charAt(i) - '0';
                if (i % 2 == 0) {
                    listaPares[i] = cedula.charAt(i) - '0';
                    //System.out.println("I" + listaPares[i]);
                    impares=( cedula.charAt(i) - '0') * 2;
                    if(impares>9){
                        totalImpares+=impares-9;
                    }else{
                        totalImpares+=impares;
                    }
                } else {
                    listaImparas[i] = cedula.charAt(i) - '0';
                    //System.out.println("P" + listaImparas[i]);
                    totalPares += cedula.charAt(i) - '0';
                }
            }

            sumTotal = totalImpares + totalPares;
            int mod = sumTotal % 10;
            if (mod == 0 && ultimoDigito == mod) {
                System.out.println("La cédula ingresada es Válida");
            } else {
                int dig = 10 - mod;
                if (dig == ultimoDigito) {
                    System.out.println("La cédula ingresada es Válida");
                } else {
                    System.out.println("Ingrese una cédula válida");
                }
            }

        } else {
            System.out.println("Revise el número de dígitos de su cédula");
        }

    }
}
