
import javax.swing.JOptionPane;

/**
 *
 * @author montonurb
 */
public class NomeVariavel {
    public static void main(String[] args) {
        double primeirNota = 9.4;
        double segundaNota = 7.8;
        double media = (primeirNota + segundaNota) / 2;
        
        System.out.println("Sua média é " + media);
        
        JOptionPane.showMessageDialog(null, "Sua média é " + media);
    }
}
