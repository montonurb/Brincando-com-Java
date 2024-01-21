package models;

/**
 *
 * @author montonurb
 */
public class Moto extends Veiculo {
    private String capacete;
    
    public Moto() {
    }

    public Moto(String marca, String modelo, String cor, String tipoCombustivel, double valor, int velocidade, int marcha, boolean acenderLuz, String capacete) {
        super(marca, modelo, cor, tipoCombustivel, valor, velocidade, marcha, acenderLuz);
        this.capacete = capacete;
    }
    
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
        this.velocidade = this.velocidade + 5;
    }

    @Override
    public String toString() {
        return "Moto{" + "capacete=" + capacete + ", velocidade=" + this.velocidade + "}";
    }
}
