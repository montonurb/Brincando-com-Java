
import javax.swing.JOptionPane;

/**
 *
 * @author montonurb
 */
public class Carro {
    public String cor;
    public String modelo;
    public String tipoCombustivel;
    public double valor;
    public int velocidade;
    public int marcha;

    public Carro() {
    }
    
//    public Carro() {
//        cor = "Amarelo";
//        modelo = "Fiat";
//        tipoCombustivel = "Gasolina";
//    }
    
    public Carro(String cor, String modelo, String tipoCombustivel, double valor) {
        this.cor = cor;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.valor = valor;
    }
    
    public Carro(String cor, String modelo, String tipoCombustivel, double valor, int velocidade, int marcha) {
        this.cor = cor;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.valor = valor;
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

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
    }
    
    public void mudarMarcha() {
        marcha += 1;
    }
    
    public int retornarVelocidade() {
        return velocidade;
    }
    
    public String mensagem() {
        return "Marcha: " + marcha + ", velocidade: " + velocidade + "km/h";
    }
    
    public void acelerarManualmente(int pesoVelocidade) {
        velocidade += pesoVelocidade;
    }
    
    public double venderCarro(double descontoPorcentagem) {
        double porcentagem = descontoPorcentagem / 100;
        return valor - (valor * porcentagem);
    }
}
