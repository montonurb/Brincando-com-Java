package interfaces;

/**
 *
 * @author montonurb
 */
public interface Motor {
    
    public abstract void ligar();
    
    //Como é uma interface, tanto faz colocar no método se é abstract ou não,
    //pois implicitamente ele entende já como abstract.
    public void desligar();
}
