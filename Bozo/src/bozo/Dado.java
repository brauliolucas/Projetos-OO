/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozo;

/**
 *
 * @author ice
 */
public class Dado {

    public int Faces [];
    public boolean estadoDados[];
    static int T=6;

    
    ///true = pode ser rodado, false = travado

    public Dado(int[] Faces, boolean[] estadoDados) {
        this.Faces = Faces;
        this.estadoDados = estadoDados;
        
    }
    
    
    
    
    
    
}
