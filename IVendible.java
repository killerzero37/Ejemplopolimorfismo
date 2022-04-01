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
public interface IVendible {

    public void vender(int unidadesVendidas);

    public boolean hayStock(int stockUsuario);
}
