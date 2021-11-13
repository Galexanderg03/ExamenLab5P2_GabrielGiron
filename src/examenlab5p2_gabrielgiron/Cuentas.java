/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab5p2_gabrielgiron;
import java.util.Random;
/**
 *
 * @author Galex
 */
public class Cuentas {
    private Random r = new Random();
    private String Nombre;
    private String Usuario;
    private String Contraseña;
    private String PersonajeFav;
    private String Edad;
    private String CuentaBancaria;
    private String TipoCuenta;
    private int SaldoCuenta = 1999+r.nextInt(10000);

    public Cuentas(String Nombre, String Usuario, String PersonajeFav, String Edad, String CuentaBancaria, String TipoCuenta, String Contraseña) {
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.PersonajeFav = PersonajeFav;
        this.Edad = Edad;
        this.CuentaBancaria = CuentaBancaria;
        this.TipoCuenta = TipoCuenta;
        this.Contraseña = Contraseña;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPersonajeFav() {
        return PersonajeFav;
    }

    public void setPersonajeFav(String PersonajeFav) {
        this.PersonajeFav = PersonajeFav;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    public int getSaldoCuenta() {
        return SaldoCuenta;
    }

    public void setSaldoCuenta(int SaldoCuenta) {
        this.SaldoCuenta = SaldoCuenta;
    }

    @Override
    public String toString() {
        return "Cuentas{" + "Nombre=" + Nombre + ", Usuario=" + Usuario + ", PersonajeFav=" + PersonajeFav + ", Edad=" + Edad + ", CuentaBancaria=" + CuentaBancaria + '}';
    }
      
}
