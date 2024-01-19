
import javax.swing.JOptionPane;

/**
 *
 * @author montonurb
 */
public class EntradaDeDados {
    public static void main(String[] args) {
        String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno");
        double primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1ª Nota"));
        double segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1ª Nota"));
        double media = (primeiraNota + segundaNota) / 2; 
        
        JOptionPane.showMessageDialog(null, "O aluno " + nomeAluno + " tem média " + media);
        
    }
}
