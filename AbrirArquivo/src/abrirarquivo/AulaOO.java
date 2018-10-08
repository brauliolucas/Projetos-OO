/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abrirarquivo;

/**
 *
 * @author ice
 */
public class AulaOO {
    
    
    public void ChegarNaAula(int Horario){
        try{
            if(Horario > 19)
               throw new Atrasado("Tchau");
        }catch(Atrasado e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
    
}
