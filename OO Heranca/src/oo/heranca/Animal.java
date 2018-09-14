/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.heranca;

/**
 *
 * @author ice
 */
public class Animal {
    protected int idade;
    protected String raça;
    protected String nome;

    public Animal(){
        
    }
    
    public Animal(int idade, String raça, String nome) {
        this.idade = idade;
        this.raça = raça;
        this.nome = nome;
    }
    
    
    
    
    public void comer(){
        System.out.println("To comendo");
    }
    public void dormir(){
        System.out.println("To dormindo");
    }
    public void emitirSom(){
        System.out.println("");
    }

    
    
    public int getIdade() {
        return idade;
    }

    public String getRaça() {
        return raça;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
