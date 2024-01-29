package models;

import javax.swing.JOptionPane;

/**
 *
 * @author montonurb
 */
public class Contato {
    private TipoContato tipoContato;
    private String numero;

    public Contato() {}
    
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null, "Tipo Contato: " + tipoContato.getDescricao() + ", Número: " + numero);
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
