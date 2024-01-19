
import javax.swing.JOptionPane;


/**
 *
 * @author montonurb
 */
public class Variaveis {
    public static void main(String[] args) {
        String produto = "Caneta";
        int quantidade = 10;
        double valorUnitario = 1.25;
        double valorTotal = valorUnitario * quantidade;
        
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor unitário: " + valorUnitario);
        System.out.println("Valor total: " + valorTotal);
        
        JOptionPane.showMessageDialog(null, "Quantidade: " + quantidade + "\nValor unitário: " + valorUnitario + "\nTotal: " + valorTotal);
    }
}