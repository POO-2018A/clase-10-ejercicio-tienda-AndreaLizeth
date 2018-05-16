/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrea Lizeth
 */
public class Deber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductosTienda[] productos = new ProductosTienda[10];
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenidos");
        System.out.println("Ingrese el ruc");
        String ruc;
        ruc=scan.nextLine();
        System.out.println("Ingrese direccion");
        String Direccion;
        Direccion=scan.nextLine();
        System.out.println("Ingrese el nombre de la tienda");
        String nombreTienda;
        nombreTienda=scan.nextLine();
        Tienda tienda1 = new Tienda(ruc, Direccion, nombreTienda);
        System.out.println(tienda1.toString());
        String nombre;
        String tipo;
        int cod;
        double precio;
        int cont = 0;
        int opc;
        do {
            System.out.println("1) Ingresar nuevo producto");
            System.out.println("2) Visualizar lista de productos");
            System.out.println("3) salir");

            System.out.println("Ingrese la opcion deseada: ");
            opc = scan.nextInt();

            switch (opc) {
                case 1:

                    if (cont <= productos.length) {
                        System.out.println("Ingresar nuevo porducto");
                        System.out.println("Ingrese el nombre: ");
                        nombre = scan.next();
                        System.out.println("Ingrese el codigo: ");
                        cod = scan.nextInt();
                        System.out.println("Ingrese el precio:");
                        precio = scan.nextDouble();
                        System.out.println("Ingrese el tipo:");
                        tipo = scan.next();
                        ProductosTienda producto = new ProductosTienda(nombre, cod, tipo, precio);
                        productos[cont] = producto;
                        cont++;
                    } else {
                        System.out.println("No se puede ingresar mas productos");
                    }

                    break;
                case 2:
                    System.out.println("Los productos son los siguientes:");
                    for (int i = 0; i < cont; i++) {
                        System.out.println(productos[i].toString());
                    }

                    break;
                

                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        } while (opc != 3);

    }

}
