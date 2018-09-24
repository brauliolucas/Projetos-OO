/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.heranca;

import java.util.ArrayList;

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
        Animal animal = new Animal() {};
        animal.comer();
        animal.dormir();
        animal.emitirSom();
        
        Cachorro c1 = new Cachorro(2,"Golden","Ze");
        c1.emitirSom();
        
        Gato g1 = new Gato(1,"Persa","Chatao");
        
        Leao l1 = new Leao(20,"Rei da selva","Simba");
        
        Fight fight = new Fight();
        fight.briga(c1, g1, l1);
        
        ArrayList <Animal> animais = new ArrayList<Animal>();
        animais.add(new Cachorro(5,"labrador","tiao"));
        animais.add(new Gato(4,"Mia no telhado","Felix"));
        animais.add(new Leao(25,"General da selva","Pai do Simba"));
        
        for(int i=0;i<animais.size();i++){
            
            animais.get(i).emitirSom();
            System.out.println(animais.get(i).getNome());
        }
        
        Cachorro c2 = new Cachorro(2,"Golden","Ze");
        Cachorro c3 = new Cachorro(4,"Mia no telhado","Ze");
        
        System.out.println(c2.equals(c3));
        
        
        System.out.println(c2.toString());
 
    }
    
}
