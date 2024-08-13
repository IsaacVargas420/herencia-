/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import modelo.Docente;
import modelo.Estudiante;

/**
 *
 * @author Usuario
 */
public class DocenteControlador {
    private Docente docente;
    //conexión
    ConexionBDD conexion = new ConexionBDD();
    Connection connection = (Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public void crearDocente(Docente d) {
        try {
            String consultaSQL="INSERT INTO docentes (especialidad,titulo,registroSenescyt,escalaSalarial,idpersona) VALUES ('"+d.getEspecialidad()+"','"+d.getTitulo()+"','"+d.getRegistroSenescyt()+"','"+d.getEscalaSalarial()+"','"+d.getIdPersona()+"');";
            PreparedStatement ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            int resultado=ejecutar.executeUpdate();
            if(resultado>0){
            
                System.out.println("El docente fue creado con éxito");
            }else{
                System.out.println("Ingrese los datos de manera correcta");
            }
        } catch (Exception e) {
            System.out.println("Comuníquese con el Administrador del Sistema para que resuelva este error"+e);
        }

    }
}
