
import javax.swing.JOptionPane;

/**
 *
 * @author montonurb
 */
public class Principal {
    public static void main(String[] args) {
        Motorista motorista = new Motorista();
        
        motorista.setNome("Abimar");
        motorista.setCpf("098.098.000-99");
        motorista.setContato("(86) 99910-0910");

        JOptionPane.showMessageDialog(null, motorista.toString());
        
//        String mensagem;
//        Carro carro = new Carro();
//        carro.cor = "Amarelo";
//        carro.modelo = "Fiat";
//        carro.tipoCombustivel = "Gasolina";
//        carro.valor = 1000.00;
//        carro.ligar();
//        carro.mudarMarcha();
//        
//        while(carro.marcha > 0 && carro.marcha <= 6) {
//            carro.acelerarManualmente(15);
//            System.out.println(carro.mensagem());
//            carro.mudarMarcha();
//        }
//        
//        carro.mensagem();
//        System.out.println("Valor do carro: " + carro.valor);
//        System.out.println("Valor do carro com desconto: " + carro.venderCarro(10));
        
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