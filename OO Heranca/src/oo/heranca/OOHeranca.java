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
public class OOHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        animal.comer();
        animal.dormir();
        animal.emitirSom();
        
        Cachorro c1 = new Cachorro(2,"Golden","Ze");
        c1.emitirSom();
        
        Gato g1 = new Gato(1,"Persa","Chatao");
        
        Leao l1 = new Leao(20,"Rei da selva","Simba");
        
        Fight fight = new Fight();
        fight.briga(c1, g1, l1);
    }
    
}
