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
public class ProductosTienda {

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    private String marca;
    private int codigo;
    private String tipo;
    private double precio;

    public ProductosTienda(String marca, int codigo, String tipo, double precio) {
        this.marca = marca;
        this.codigo = codigo;
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "marca: " + getMarca() + "\ncodigo: " + getCodigo()+ "\ntipo: " + getTipo() + "\nprecio: " +getPrecio();
    }
    
    
    
}
