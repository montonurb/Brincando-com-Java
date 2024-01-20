
import javax.swing.JOptionPane;

/**
 *
 * @author montonurb
 */
public class Principal {
    public static void main(String[] args) {
//        String mensagem;
        Carro carro = new Carro();
        carro.cor = "Amarelo";
        carro.modelo = "Fiat";
        carro.tipoCombustivel = "Gasolina";
        carro.valor = 56000.00;
        carro.ligar();
        carro.mudarMarcha();
        carro.acelerar();
        carro.acelerar();
        carro.mensagem();
        
//        mensagem = "Carro de modelo " + carro.modelo
//                + ", cor " + carro.cor + ", combustível do tipo "
//                + carro.tipoCombustivel + " custa R$ " + carro.valor;
//        
//        JOptionPane.showMessageDialog(null, mensagem);
//        
//        Carro carro2 = new Carro();
//        carro2.cor = "Cinza";
//        carro2.modelo = "Honda";
//        carro2.tipoCombustivel = "Flex";
//        carro2.valor = 89900.00;
//        
//        mensagem = "Carro de modelo " + carro2.modelo
//                + ", cor " + carro2.cor + ", combustível do tipo "
//                + carro2.tipoCombustivel + " custa R$ " + carro2.valor;
//        
//        JOptionPane.showMessageDialog(null, mensagem);
    }
}