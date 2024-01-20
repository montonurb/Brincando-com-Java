
import javax.swing.JOptionPane;

/**
 *
 * @author montonurb
 */
public class Carro {
    String cor;
    String modelo;
    String tipoCombustivel;
    double valor;
    int velocidade;
    int marcha;

    public void ligar() {
        velocidade = 0;
        marcha = 0;
        JOptionPane.showMessageDialog(null, "O carro está ligado!");
    }
    
    public void desligar() {
        JOptionPane.showMessageDialog(null, "O carro está desligado!");
    }
    
    public void acelerar() {
        velocidade += 10;
        
        JOptionPane.showMessageDialog(null, "Velocidade: " + velocidade);
    }
    
    public void mudarMarcha() {
        marcha += 1;
        JOptionPane.showMessageDialog(null, "Marcha: " + marcha);
    }
    
    public int retornarVelocidade() {
        return velocidade;
    }
    
    public String mensagem() {
        return "Marcha: " + marcha + ", velocidade: " + velocidade + "km/h";
    }
}
