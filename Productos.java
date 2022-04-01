/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papelerias;

/**
 *
 * @author formacion15
 */
public abstract class Productos implements IVendible {

    protected int stock;
    protected double precio;

    @Override
    public void vender(int unidadesVendidas) {

        if (this.hayStock(unidadesVendidas)) {
            double retorno = this.precio * unidadesVendidas;
            this.stock -= unidadesVendidas;
            System.out.println("Precio: " + retorno + " €");
            System.out.println("Stock: " + (this.stock));

        } else {
            System.out.println("No queda stock");

        }

    }

}
