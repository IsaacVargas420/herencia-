/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import modelo.Administrativo;
import modelo.Estudiante;

/**
 *
 * @author Usuario
 */
public class AdministrativoControlador {
    private Administrativo admin;
    //conexión
    ConexionBDD conexion = new ConexionBDD();
    Connection connection = (Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public void crearAdministrativo(Administrativo ad, int idPersona) {
        try {
            String consultaSQL="INSERT INTO administrativos (cargo,area,idpersona) VALUES ('"+ad.getCargo()+"','"+ad.getArea()+"',"+idPersona+");";
            PreparedStatement ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            int resultado=ejecutar.executeUpdate();
            if(resultado>0){
            
                System.out.println("El administrativo fue creado con éxito");
            }else{
                System.out.println("Ingrese los datos de manera correcta");
            }
        } catch (Exception e) {
            System.out.println("Comuníquese con el Administrador del Sistema para que resuelva este error"+e);
        }

    }
}
