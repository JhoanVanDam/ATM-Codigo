/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.Login;
import Interfaces.RetiroCuentaAhorros;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhoan
 */
public class Retiros {

    ConexionDB db = new ConexionDB();
    Rut rut = new Rut();
    Login log = new Login();

    public String ObtenerDinero() {
        String Consulta = ("select pers_dinero from Persona where pers_Documento =" + this.log.getDoc() + ";");
        try {
            ResultSet RESPUESTA = db.consultar(Consulta);

            return (RESPUESTA.getString("pers_dinero"));

        } catch (SQLException ex) {
            Logger.getLogger(RetiroCuentaAhorros.class.getName()).log(Level.SEVERE, null, ex + "No se econtró la cuenta");
            return null;
        }
    }

}
