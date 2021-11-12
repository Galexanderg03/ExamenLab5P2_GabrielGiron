/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab5p2_gabrielgiron;

/**
 *
 * @author Galex
 */
public class Cuentas {
    private String Nombre;
    private String Usuario;
    private String PersonajeFav;
    private int Edad;
    private long CuentaBancaria;

    public Cuentas() {
    }

    public Cuentas(String Nombre, String Usuario, String PersonajeFav, int Edad, long CuentaBancaria) {
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.PersonajeFav = PersonajeFav;
        this.Edad = Edad;
        this.CuentaBancaria = CuentaBancaria;
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

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public long getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCuentaBancaria(long CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    @Override
    public String toString() {
        return "Cuentas{" + "Nombre=" + Nombre + ", Usuario=" + Usuario + ", PersonajeFav=" + PersonajeFav + ", Edad=" + Edad + ", CuentaBancaria=" + CuentaBancaria + '}';
    }
      
}
