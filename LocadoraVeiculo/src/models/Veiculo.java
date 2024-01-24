package models;

/**
 *
 * @author montonurb
 */
public abstract class Veiculo {
    public static final int VELOCIDADE_MAXIMA = 200;
    private String marca;
    private String modelo;
    public String cor;
    public TipoCombustivel tipoCombustivel;
    private double valor;
    private int velocidade;
    private int marcha;
    protected boolean acenderLuz;
    private Motorista motorista;

    public Veiculo() {
    }
    
    public abstract void mostrarDados();
    
    public abstract void acelerar();

    public abstract void tipoVeiculo();

    public void mudarMarcha() {
        marcha += 1;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public boolean isAcenderLuz() {
        return acenderLuz;
    }

    public void setAcenderLuz(boolean acenderLuz) {
        this.acenderLuz = acenderLuz;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
}
