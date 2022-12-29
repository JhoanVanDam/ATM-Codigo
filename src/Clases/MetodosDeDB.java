/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Jhoan
 */
public class MetodosDeDB {

    ConexionDB db = new ConexionDB();
    Rut rut = new Rut();

    public MetodosDeDB() {
        
        db.conexion();
    }

    public String consultarpor(int consultar, int por, String idpor) {
        
        db.conexion();
        String CASOconsultar = "";
        String CASOpor = "";

        switch (consultar) {
            case 1:
                CASOconsultar = "pers_Usuario";
                break;
            case 2:
                CASOconsultar = "pers_Correo";
                break;
            case 3:
                CASOconsultar = "pers_Documento";
                break;
            case 4:
                CASOconsultar = "pers_Direccion";
                break;
            case 5:
                CASOconsultar = "pers_Contrasena";
                break;
            case 6:
                CASOconsultar = "pers_dinero";
                break;

        }
        switch (por) {
            case 1:
                CASOpor = "pers_Usuario=";
                break;
            case 2:
                CASOpor = "pers_Correo=";
                break;
            case 3:
                CASOpor = "pers_Documento=";
                break;
            case 4:
                CASOpor = "pers_Direccion=";
                break;
            case 5:
                CASOpor = "pers_Contrasena=";
                break;
            case 6:
                CASOpor = "pers_dinero=";
                break;

        }
        try {
            ResultSet RESPUESTA = db.consultar("select " + CASOconsultar + " from Persona where " + CASOpor + "='" + idpor + "';");
            return RESPUESTA.getString(CASOconsultar);
        } catch (Exception e) {
            System.out.println("Error NO SE PUDO CONSULTAR , en consultar por" + e);
            return null;
        }finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }

    }


    public String ConsultarCorreoPorDocumento(int Documento) {
        
        db.conexion();
        ResultSet RESPUESTA = db.consultar("select pers_Correo from Persona where pers_Documento=" + Documento + ";");

        try {
            String Correo = RESPUESTA.getString("pers_Correo");
            return Correo;
        } catch (SQLException ex) {
            Logger.getLogger(MetodosDeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }
    }

    public String ConsultarDineroPorDocumento(int Documento) {
        
        db.conexion();
        ResultSet RESPUESTA = db.consultar("select pers_dinero from Persona where pers_Documento=" + Documento + ";");
        try {
            String Dinero = RESPUESTA.getString("pers_dinero");
            return Dinero;
        } catch (SQLException ex) {
            System.out.println("No se generó conexion en ConsultaDineroPorDocumento");
            Logger.getLogger(MetodosDeDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }

    }

    public String EditarDineroPorDocumento(double DineroConsignado, String Documento) {
       
        db.conexion();
        try {
            db.Editar("UPDATE Persona set pers_dinero = " + DineroConsignado + " where pers_Documento = " + Documento + ";");
            System.out.println("UPDATE Persona set pers_dinero = " + DineroConsignado + " where pers_Documento = " + Documento + ";");

            return "Transaccion exitosa";
        } catch (Exception e) {
            System.out.println("Error no se pudo actualizar" + e);
            return null;
        }

    }
    public String EditarDineroPor(int Editar,String par1, int por,String par2) {
        
        db.conexion();
        String CASOconsultar = "";
        String CASOpor = "";

        switch (Editar) {
            case 1:
                CASOconsultar = "pers_Usuario";
                break;
            case 2:
                CASOconsultar = "pers_Correo";
                break;
            case 3:
                CASOconsultar = "pers_Documento";
                break;
            case 4:
                CASOconsultar = "pers_Direccion";
                break;
            case 5:
                CASOconsultar = "pers_Contrasena";
                break;
            case 6:
                CASOconsultar = "pers_dinero";
                break;

        }
        switch (por) {
            case 1:
                CASOpor = "pers_Usuario=";
                break;
            case 2:
                CASOpor = "pers_Correo=";
                break;
            case 3:
                CASOpor = "pers_Documento=";
                break;
            case 4:
                CASOpor = "pers_Direccion=";
                break;
            case 5:
                CASOpor = "pers_Contrasena=";
                break;
            case 6:
                CASOpor = "pers_dinero=";
                break;

        }
        try {
            System.out.println(db.Editar("UPDATE Persona set "+CASOconsultar+"= "+par1+ " where "+CASOpor+"=" + par2 + ";"));

            return "Transaccion exitosa";
        } catch (Exception e) {
            System.out.println("Error no se pudo actualizar" + e);
            return null;
        }

    }

    public boolean ExisteoNO(String DocumentoAsignado) {
        
        db.conexion();
        String ConsultaDocumento = ("select pers_Documento from Persona;");

        try {

            ResultSet DOCUMENTO = db.consultar(ConsultaDocumento);
            while (DOCUMENTO.next()) {

                if (DOCUMENTO.getString("pers_Documento").equals(DocumentoAsignado)) {
                    System.out.println("ELDOCUMENTOYAEXISTEPASOPORPERSONAS");
                    return true;
                }

            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Personas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                db.cerrarconexion();
            } catch (Exception e) {
            }
        }

    }

}
