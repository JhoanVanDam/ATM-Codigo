/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;

/**
 *
 * @author Jhoan
 */
public class ConexionDB {

    
    protected Connection conn;

    public ConexionDB() {
        this.conn = null;
    }

    
    public void cerrarconexion(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void conexion() {
        try {
            File Archivo = new File("DB/sistema.s3db");
           System.out.println( "LA RITA ES_"+Archivo.getAbsoluteFile());
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:"+Archivo.getAbsolutePath() );
            System.out.println("Conexion generada");
        } catch (Exception e) {
            System.out.println("No se generó" + e);
        }
    
    }
   

    public int insertar(String SQLINSERT) {
        try {
            PreparedStatement pstm = conn.prepareStatement(SQLINSERT);
            pstm.execute();
            
            return 1;
        } catch (SQLException e) {
            return 0;
        }

    }

    public int Editar(String SQLINSERT) {
        try {
            PreparedStatement pstm = conn.prepareStatement(SQLINSERT);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            return 0;
        }

    }

    public ResultSet consultar(String sqlsentencia) {
        try {
            PreparedStatement pstm = conn.prepareStatement(sqlsentencia);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;

        } catch (Exception e) {
            System.out.println("Error no existe" + e);
            return null;
        }

    }

}
