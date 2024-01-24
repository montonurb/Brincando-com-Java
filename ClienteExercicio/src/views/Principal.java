package views;

import java.util.Calendar;
import models.Cliente;
import models.Sexo;

/**
 *
 * @author montonurb
 */
public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Calendar data = Calendar.getInstance();
        cliente.setNome("Bruno");
        cliente.setCpf("06420707331");
        cliente.setTelefone("86999116978");
        cliente.setSexo(Sexo.MASCULINO);
        data.set(Calendar.YEAR, 1996);
        cliente.setAnoNascimento(data);
        
        //System.out.println("Ano: " + cliente.getAnoNascimento());
        
        cliente.imprimirDados();
    }
}
