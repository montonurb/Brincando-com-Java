package models;

import interfaces.Motor;

/**
 *
 * @author montonurb
 */
public class Carro extends Veiculo implements Motor {
    
    public Carro() {}

    @Override
    public void ligar() {
        System.out.println("O carro está ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("O carro está desligado!");
    }

    @Override
    public void mostrarDados() {
        System.out.println("Eu sou um carro!");
    }

    @Override
    public void acelerar() {
        System.out.println("Colocar dados aqui!");
    }

    @Override
    public void tipoVeiculo() {
        System.out.println("Colocar dados aqui!");
    }
}
