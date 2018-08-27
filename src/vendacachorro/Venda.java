/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendacachorro;

/**
 *
 * @author ice
 */
public class Venda {
    
    public int numCachorros=0;
    public Cachorro estoque[];
    
    public void setEstoque(Cachorro vet1[]){
        estoque = vet1;
    }
    
            public void numCachorros(Cachorro estoque[]){
                int i=0;
                while(estoque[i]!=null){
                    i++;
                }
                numCachorros = i;
            }
    
    
    
            
    public boolean checarCachorro(Cachorro cachorro,Cachorro estoque[]){
        int i = 0;
        while(estoque[i]!=null){
            if(estoque[i].getRaca()==cachorro.getRaca()){
                return true;
            }
    
        }
        return false;
    }
    
    public void venderCachorro(Cachorro cachorro,Cachorro vet1[]){
        int i=0;
        
        if(checarCachorro(cachorro,estoque)){
            estoque[i] = null;
            
            for(int j=i;j<numCachorros-1;j++){
                estoque[j] = estoque[j+1];
            }
        }
        
    }
    
    public void listarEstoque(Cachorro estoque[]){
        int i =0;
        while(estoque[i] != null){
            System.out.println("Nome : " + estoque[i].getNome());
            System.out.println("Raca : " + estoque[i].getRaca());
            System.out.println("Idade : " + estoque[i].getIdade());
            System.out.println("Preco : " + estoque[i].getPreco());
        }
    }
    
    
    
}
