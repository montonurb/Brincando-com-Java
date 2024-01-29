package models;

/**
 *
 * @author montonurb
 */
public enum TipoContato {
    TELEFONE(0, "Telefone"),
    CELULAR(1, "Celular");
    
    private int codigo;
    private String descricao;

    private TipoContato(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
