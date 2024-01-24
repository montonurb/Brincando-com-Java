package models;

import interfaces.Motor;

/**
 *
 * @author montonurb
 */
public class Moto extends Veiculo implements Motor {
    
    public static final int VELOCIDADE_MAXIMA =150;
    private String capacete;
    
    public Moto() {}
    
    public void ligarFarol() {
        this.acenderLuz = true;
    }
    
    public void desligarFarol() {
        this.acenderLuz = false;
    }

    public String getCapacete() {
        return capacete;
    }

    public void setCapacete(String capacete) {
        this.capacete = capacete;
    }
    
    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 5);
    }

    @Override
    public String toString() {
        return "Moto{" + "capacete=" + capacete + ", velocidade=" + getVelocidade() + "}";
    }

    @Override
    public void ligar() {
        System.out.println("A moto está ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("A moto está desligada!");
    }

    @Override
    public void mostrarDados() {
        System.out.println("Eu sou uma moto!");
    }

    @Override
    public void tipoVeiculo() {
        System.out.println("Colocar dados aqui!");
    }
}
