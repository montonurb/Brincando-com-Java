package models;

import javax.swing.JOptionPane;

/**
 *
 * @author montonurb
 */
public class Carro extends Veiculo {
    
    private Motorista motorista;

    public Carro() {
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
}
