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
public class Fight {


    public void briga (Cachorro c1, Gato g1, Leao l1){
        System.out.println(c1.nome + g1.nome + l1.nome + "estao se matando");
        
        if(c1.idade < l1.idade && l1.idade > g1.idade){
            System.out.println("Devido a sua experiencia em combate" + g1.nome + ", venceu a batalha");
        }
    }
    
}
