/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author PC19
 */


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.Persona;
import java.sql.ResultSet;


public class PersonaControlador {

    //ATRIBUTOS
    //modelo
    private Persona persona;
    //conexión
    ConexionBDD conexion = new ConexionBDD();
    Connection connection = (Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    //INSERTAR FILAS EN UNA TABLA
    public void crearPersona(Persona p) {
        try {//exception que lanza la consulta
            //String estático-> dinámicos que son los gets
            String consultaSQL = "INSERT INTO persona(nombres,apellidos,cedula,usuario,clave,direccion,correoElectronico,sexo,fechaNacimiento,telefono)VALUES ('" + p.getNombres() + "','" + p.getApellidos() + "','" + p.getCedula() + "','" + p.getUsuario() + "','" + p.getClave() + "','" + p.getDireccion() + "','" + p.getCorreoElectronico() + "','" + p.getSexo() + "','" + p.getFechaNacimiento() + "'," + p.getTelefono() + ");";
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL);
            //dar clic en el play =>ejecutar la consulta
            int res = ejecutar.executeUpdate();
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
}