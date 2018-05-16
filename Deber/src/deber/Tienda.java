/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

/**
 *
 * @author Andrea Lizeth
 */
public class Tienda {
    private String Ruc;
    private String direccion;
    private String nombre;

    public Tienda(String Ruc, String direccion, String nombre) {
        this.Ruc = Ruc;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
      return "Ruc: " +   getRuc()+"\ndireccion: " + getDireccion() + "\nnombre: " + getNombre() ;
    } 
    
    
}
