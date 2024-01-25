package models;

import javax.swing.JOptionPane;

/**
 *
 * @author montonurb
 */
public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void mostrarDados() {
        double valorComDesconto;
        if (quantidade <= 10) {
            valorComDesconto = preco * quantidade;
            JOptionPane.showMessageDialog(null, "Produto: " + nome + ", Preço: R$ " + preco + ", Quantidade: " + quantidade + ", Valor Total: R$ " + valorComDesconto);
        } else if (quantidade >= 11 && quantidade <= 20) {
            valorComDesconto = (preco * quantidade) - ((preco * quantidade) * 0.1);
            JOptionPane.showMessageDialog(null, "Produto: " + nome + ", Preço: R$ " + preco + ", Quantidade: " + quantidade + ", Valor com Desconto: R$ " + valorComDesconto);
        } else if (quantidade >= 21 && quantidade <= 50) {
            valorComDesconto = (preco * quantidade) - ((preco * quantidade) * 0.2);
            JOptionPane.showMessageDialog(null, "Produto: " + nome + ", Preço: R$ " + preco + ", Quantidade: " + quantidade + ", Valor com Desconto: R$ " + valorComDesconto);
        } else if (quantidade > 50) {
            valorComDesconto = (preco * quantidade) - ((preco * quantidade) * 0.25);
            JOptionPane.showMessageDialog(null, "Produto: " + nome + ", Preço: R$ " + preco + ", Quantidade: " + quantidade + ", Valor com Desconto: R$ " + valorComDesconto);
        } else {
            JOptionPane.showMessageDialog(null, "Quantidade é inválida!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
