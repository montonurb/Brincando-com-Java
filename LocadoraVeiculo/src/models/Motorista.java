package models;

/**
 *
 * @author montonurb
 */
public class Motorista {
    private String nome;
    private String cpf;
    private String contato;
    
    public Motorista(){
    }

    public Motorista(String nome, String cpf, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Motorista{" + "nome=" + nome + ", cpf=" + cpf + ", contato=" + contato + '}';
    }
}
