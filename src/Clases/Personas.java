/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhoan
 */
public class Personas {
    private String Nombre;
    private int Documento;
    private int Edad;
    private String Ocupacion;
    private Date FechaNacimiento;
    private String CorreoE;
    private String Direccion;
    ConexionDB db = new ConexionDB();
   

    public Personas(String Nombre, int Documento, int Edad, String Ocupacion, Date FechaNacimiento, String CorreoE, String Direccion) {
       
        
        db.conexion();
        
        this.Nombre = Nombre;
        this.Documento = Documento;
        this.Edad = Edad;
        this.Ocupacion = Ocupacion;
        this.FechaNacimiento = FechaNacimiento;
        this.CorreoE = CorreoE;
        this.Direccion = Direccion;
    }
    public Personas(){
        
        db.conexion();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getCorreoE() {
        return CorreoE;
    }

    public void setCorreoE(String CorreoE) {
        this.CorreoE = CorreoE;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", Documento=" + Documento + ", Edad=" + Edad + ", Ocupacion=" + Ocupacion + ", FechaNacimiento=" + FechaNacimiento + ", CorreoE=" + CorreoE + ", Direccion=" + Direccion + '}';
    }
    
    
    
}
