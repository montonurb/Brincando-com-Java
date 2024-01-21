package models;

import utils.Mensagem;

/**
 *
 * @author montonurb
 */
public class Veiculo {
    public static final int VELOCIDADE_MAXIMA = 200;
    private String marca;
    private String modelo;
    public String cor;
    public String tipoCombustivel;
    public double valor;
    public int velocidade;
    public int marcha;
    protected boolean acenderLuz;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String cor, String tipoCombustivel, double valor, int velocidade, int marcha, boolean acenderLuz) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.valor = valor;
        this.velocidade = velocidade;
        this.marcha = marcha;
        this.acenderLuz = acenderLuz;
    }
    
    public void tipoVeiculo() {
        Mensagem.mensagem("Aqui é um veículo!");
    }
    
    public void ligar() {
        velocidade = 0;
        marcha = 0;
        Mensagem.mensagem("O veículo está ligado!");
    }

    public void desligar() {
        Mensagem.mensagem("O veículo está desligado!");
    }

    public void acelerar() {
        if(velocidade <= VELOCIDADE_MAXIMA) {
            velocidade += 10;
        } else {
            desligar();
        }
    }

    public void acelerar(int pesoVelocidade) {
        if (pesoVelocidade > VELOCIDADE_MAXIMA) {
            desligar();
        } else {
            velocidade += pesoVelocidade;
        }
    }

    public void mudarMarcha() {
        marcha += 1;
    }

    public int retornarVelocidade() {
        return velocidade;
    }
    
    public double venderVeiculo(double descontoPorcentagem) {
        double porcentagem = descontoPorcentagem / 100;
        return valor - (valor * porcentagem);
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

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
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
}
