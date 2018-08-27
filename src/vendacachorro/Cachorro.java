/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendacachorro;

import java.util.logging.Logger;

/**
 *
 * @author ice
 */
public class Cachorro {
    
    private String nome;
    private String raca;
    private int idade;
    private int preco;
    
    public Cachorro(String nome, String raca, int idade, int preco) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.preco = preco;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
}
