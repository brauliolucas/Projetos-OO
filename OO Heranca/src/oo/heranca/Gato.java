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
public class Gato extends Animal {

    public Gato(int idade, String raça, String nome) {
        super(idade, raça, nome);
    }
    
    
    @Override
    public void emitirSom(){
        System.out.println("Miau!");
    }
    
}
