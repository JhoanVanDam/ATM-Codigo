/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Jhoan
 */
public class Cuentas {
    private Personas Usuario;
    private String NumeroCuenta;
    private String ContraseñaCuenta;
    private Double Saldo;
    private int TipoDeCuenta;/* 1-Ahorros  2-Corriente 3-Nomina */
    private boolean TarjetaDeCredito;/*True == Si tiene False == No tiene*/

    public Cuentas(Personas Usuario, String NumeroCuenta, String ContraseñaCuenta, Double Saldo, int TipoDeCuenta, boolean TarjetaDeCredito) {
        this.Usuario = Usuario;
        this.NumeroCuenta = NumeroCuenta;
        this.ContraseñaCuenta = ContraseñaCuenta;
        this.Saldo = Saldo;
        this.TipoDeCuenta = TipoDeCuenta;
        this.TarjetaDeCredito = TarjetaDeCredito;
    }

    public Personas getUsuario() {
        return Usuario;
    }

    public void setUsuario(Personas Usuario) {
        this.Usuario = Usuario;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getContraseñaCuenta() {
        return ContraseñaCuenta;
    }

    public void setContraseñaCuenta(String ContraseñaCuenta) {
        this.ContraseñaCuenta = ContraseñaCuenta;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }

    public int getTipoDeCuenta() {
        return TipoDeCuenta;
    }

    public void setTipoDeCuenta(int TipoDeCuenta) {
        this.TipoDeCuenta = TipoDeCuenta;
    }

    public boolean isTarjetaDeCredito() {
        return TarjetaDeCredito;
    }

    public void setTarjetaDeCredito(boolean TarjetaDeCredito) {
        this.TarjetaDeCredito = TarjetaDeCredito;
    }

    @Override
    public String toString() {
        return "Cuentas{" + "Usuario=" + Usuario + ", NumeroCuenta=" + NumeroCuenta + ", Contrase\u00f1aCuenta=" + ContraseñaCuenta + ", Saldo=" + Saldo + ", TipoDeCuenta=" + TipoDeCuenta + ", TarjetaDeCredito=" + TarjetaDeCredito + '}';
    }
    
}
