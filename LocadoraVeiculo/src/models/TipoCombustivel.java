package models;

/**
 *
 * @author montonurb
 */
public enum TipoCombustivel {
    ALCOOL(1, "Álcool"),
    GASOLINA(2, "Gasolina"),
    FLEX(3, ("Álcool e Gasolina"));
    
    private int valor;
    private String descricao;

    private TipoCombustivel(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
