/*
 * Classe que contem os movimentos dos pokemons
 * 
 * 
 */
package pokemonrandomizerbattle;

/**
 *
 * @author Marcus
 */
public class Movimento {
    private int precisao;
    private int danoBase;    
    private String nome;
    private int tipo;
    private boolean moveFisico;

    public Movimento(int precisao, int danoBase, String nome, int tipo, boolean moveFisico) {
        this.precisao = precisao;
        this.danoBase = danoBase;
        this.nome = nome;
        this.tipo = tipo;
        this.moveFisico = moveFisico;
    }
    
    
}
