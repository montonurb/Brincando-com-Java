package models;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author montonurb
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    Sexo sexo;
    Calendar anoNascimento;
    
    public Cliente(){}

    public Cliente(String nome, String cpf, String telefone, Sexo sexo, Calendar anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
    }
    
    public void imprimirDados() {
        System.out.println("Teste!!!");
        System.out.println("Ano: " + anoNascimento.get(Calendar.YEAR));
        JOptionPane.showMessageDialog(null, "Nome: " + nome + ", CPF: " + cpf + ", TELEFONE: " + telefone + ", Sexo: " + sexo.getDescricao() + ", ANO NASCIMENTO: " + anoNascimento.get(Calendar.YEAR));
    }
    
    public void informarIdade() {
        Calendar dataAtual = Calendar.getInstance();
        int idade = dataAtual.get(Calendar.YEAR) - anoNascimento.get(Calendar.YEAR);
        JOptionPane.showMessageDialog(null, idade + " anos");
    }
    
    public void informarMaioridade(){
        Calendar dataAtual = Calendar.getInstance();
        
        if((dataAtual.get(Calendar.YEAR) - anoNascimento.get(Calendar.YEAR)) >= 18) {
            JOptionPane.showMessageDialog(null, "É maior de idade!");
        } else {
            JOptionPane.showMessageDialog(null, "É menor de idade!");
        }
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Calendar getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Calendar anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
