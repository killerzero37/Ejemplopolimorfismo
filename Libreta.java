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
public class Libreta extends Productos {

    public Libreta() {
        this.stock = 25;
        this.precio = 1.10;
    }

    @Override
    public boolean hayStock(int stockUsuario) {

        return stockUsuario <= this.stock;

    }

}
