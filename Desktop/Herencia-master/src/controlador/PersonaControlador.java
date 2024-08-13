/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.Persona;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PersonaControlador {

    //ATRIBUTOS
    //modelo
    private Persona persona;
    //conexión
    ConexionBDD conexion = new ConexionBDD();
    Connection connection = (Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;//CONSULTAMOS O LEEMOS LA BDD

    //INSERTAR FILAS EN UNA TABLA
    public void crearPersona(Persona p) {
        try {//exception que lanza la consulta
            //String estático-> dinámicos que son los gets
            String consultaSQL = "INSERT INTO persona(nombres,apellidos,cedula,usuario,clave,direccion,correoElectronico,sexo,fechaNacimiento,telefono)VALUES ('" + p.getNombres() + "','" + p.getApellidos() + "','" + p.getCedula() + "','" + p.getUsuario() + "','" + p.getClave() + "','" + p.getDireccion() + "','" + p.getCorreoElectronico() + "','" + p.getSexo() + "','" + p.getFechaNacimiento() + "'," + p.getTelefono() + ");";
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL);
            //dar clic en el play =>ejecutar la consulta
            int res = ejecutar.executeUpdate();//INT CUANDO ESCRIBO INSERTO LA BDD
            if (res > 0) {
                System.out.println("La persona ha sido creada con éxito");
                ejecutar.close();
            } else {
                System.out.println("Favor ingrese correctamente los datos solicitados");
                ejecutar.close();
            }

        } catch (Exception e) {
            //captura el error y permite que la consola se siga
            //ejecutando
            System.out.println("ERROR:"+e);
        }
    }
    
    
    public int buscarIdPersona(String cedula){
        try {
            String consultaSQL="SELECT idpersona FROM persona WHERE cedula='"+cedula+"';";
            ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            resultado=ejecutar.executeQuery();
            if(resultado.next()){
                int idPersona=resultado.getInt("idpersona");
                resultado.close();
                return idPersona;
            }else{
                System.out.println("Ingrese una cédula válida");
                resultado.close();
            }
        } catch (Exception e) {
            System.out.println("Comuníquese con el administrador"+e);
        }
        return 0;
    
    }
    public Persona buscarDatosPersona(String cedula){
        Persona p=new Persona();   
        try {
            String consultaSQL="SELECT nombres,apellidos,cedula,usuario FROM persona WHERE cedula='"+cedula+"';";
            ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            resultado=ejecutar.executeQuery();
            if(resultado.next()){                             
                p.setNombres(resultado.getString("nombres"));
                p.setApellidos(resultado.getString("apellidos"));
                p.setCedula(resultado.getString("cedula"));
                p.setUsuario(resultado.getString("usuario"));
                p.imprimir();
                //resultado.close();
                return p;
            }else{
                System.out.println("Ingrese una cédula válida");
                resultado.close();
            }
        } catch (Exception e) {
            System.out.println("Comuníquese con el administrador"+e);
        }
        return p;
    
    }
    
    public ArrayList<Persona> listarPersonas(){
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        try {
            String consultaSQL="select nombres,apellidos,usuario,correoElectronico from persona;";
            ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            resultado=ejecutar.executeQuery();
            while(resultado.next()){
                Persona p=new Persona();
                p.setNombres(resultado.getString("nombres"));
                p.setApellidos(resultado.getString("apellidos"));
                p.setUsuario(resultado.getString("usuario"));
                p.setCorreoElectronico(resultado.getString("correoElectronico"));
                listaPersonas.add(p);           
                
            }
            resultado.close();
            return listaPersonas;
        } catch (Exception e) {
            
        }
        return listaPersonas;
    
    }
    
    public void actualizarPersonas(Persona p,String cedula){
        try {
            String consultaSQL=" update persona set cedula=?,nombres=? where cedula=?;";
            ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            ejecutar.setString(1, p.getCedula());
            ejecutar.setString(2, p.getNombres());
            ejecutar.setString(3, cedula);
            int res=ejecutar.executeUpdate();
            if(res>0){
                System.out.println("Actualización exitosa");
                resultado.close();
            }else{
                System.out.println("Revise los datos a actualizar");
                resultado.close();
            }       
        } catch (Exception e) {
            System.out.println(""+e);
        }
    
    
    }
        public void eliminarPersonas(String cedula){
        try {
            //String consultaSQL="delete from persona where cedula='"+cedula+"';";
            String consultaSQL="delete from persona where cedula=?;";
            ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);        
            ejecutar.setString(1, cedula);
            int res=ejecutar.executeUpdate();
            if(res>0){
                System.out.println("Acción exitosa");
                ejecutar.close();
            }else{
                System.out.println("El usuario no existe");
                ejecutar.close();
            }       
        } catch (Exception e) {
            System.out.println(""+e);
        }
    
    
    }
}