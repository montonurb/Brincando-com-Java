package views;

import models.Produto;

/**
 *
 * @author montonurb
 */
public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Caneta");
        produto.setPreco(1.00);
        produto.setQuantidade(11);
        
        produto.mostrarDados();
    }
}
