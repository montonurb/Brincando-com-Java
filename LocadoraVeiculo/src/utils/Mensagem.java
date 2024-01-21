package utils;
import javax.swing.JOptionPane;

/**
 *
 * @author montonurb
 */
public class Mensagem {
    public static void mensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static void mensagem(String mensagem1, String mensagem2) {
        JOptionPane.showMessageDialog(null, mensagem1 + " | " + mensagem2);
    }
}
