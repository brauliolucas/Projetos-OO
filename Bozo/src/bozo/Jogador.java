/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozo;

import static bozo.Dado.T;

/**
 *
 * @author ice
 */
public class Jogador {

    private String nome;
    private int pontuacao;
    private Dado d1;
    private int jogada;
    boolean estadoJogada = false;
    private int contJogadas = 3;

    public Jogador(String nome) {
        this.nome = nome;
    }
    
    private void gerarDados(){
            for(int i=0;i<T;i++){
                d1.estadoDados[i] = true;  
            
        }
  
    }
    
    
    
    private void rolarDados(){
        for(int i=0;i<6;i++){
            d1.Faces[i] =(int) ((Math.random()*6)+1);
            System.out.println("Faces jogada " + d1.Faces[i]);
        }
        
        if(!estadoJogada)escolherJogada();
        
        
        
    }
    public void escolherJogada(){
        System.out.println("Escolha sua jogada com base nos resultados acima");
        int x;
        
        do{
            System.out.println("1: AS, faces = 1");
            System.out.println("2: DUQUE, faces = 2");
            System.out.println("3: TERNO , faces = 3");
            System.out.println("4: QUADRA , faces = 4");
            System.out.println("5: QUINA, faces = 5");
            System.out.println("6: SENA, faces = 6");
            System.out.println("7: FULL, Duplas e Trio");
            System.out.println("8: SEGUIDA, 5 valores em seguida ");
            System.out.println("9: QUADRADA, 4 valores iguais");
            System.out.println("10: GENERAL, 5 valores iguais, 30 pontos (35 de boca)");
            System.out.println("12: rolar os dados denovo");
        }while(x < 0 || x > 11);
        
        estadoJogada = true;
        contJogadas = 0;
        calcularJogada(x);
    }
    
    
    
    
    public void calcularJogada(int id){
        switch(id){
            case 1: ///as
                for(int i=0;i<6;i++){
                    if(d1.Faces[i]==1 && d1.estadoDados[i] == true){
                        pontuacao+=1;
                        d1.estadoDados[i] = false;
                    }
                }
                break;
            case 2: ///duque
                for(int i=0;i<6;i++){
                    if(d1.Faces[i]==2 && d1.estadoDados[i] == true){
                        pontuacao+=2;
                        d1.estadoDados[i] = false;
                    }
                }
                break;
            case 3:///terno
                for(int i=0;i<6;i++){
                    if(d1.Faces[i] == 3 && d1.estadoDados[i] == true){
                        pontuacao+=3;
                        d1.estadoDados[i] = false;
                    }
                }
                break;
            case 4:///quadra
                for(int i=0;i<6;i++){
                    if(d1.Faces[i]==4 && d1.estadoDados[i] == true){
                        pontuacao+=4;
                        d1.estadoDados[i] = false;
                    }
                }
                break;
            case 5: ///quina
                for(int i=0;i<6;i++){
                    if(d1.Faces[i] == 5 && d1.estadoDados[i] == true){
                        pontuacao+=5;
                        d1.estadoDados[i] = false;
                    }
                }
                break;
            case 6: ///sena
                for(int i=0;i<6;i++){
                    if(d1.Faces[i] == 6  && d1.estadoDados[i] == true){
                        pontuacao+=6;
                        d1.estadoDados[i] = false;
                        
                    }
                }
                break;
            case 7: ///FULLL
                verfFull();
                break;
            case 8: ///SEGUIDA
                verfSeguida();
                break;
                
            case 9: ///QUADRADA
                verfQuadrada();
                break;
            case 10: ///GENERAL
                verfGeneral();
                break;
            }
        }
        
    
    
    
    public void verfFull(){
        int x3 = 0, x2 = 0;
        int full[];
        full = new int[6];
        for (int i = 0; i < 5; i++) {
            full[d1.Faces[i] - 1]++;
        }

        for (int i = 0; i < 6; i++) {
            if (full[i] == 3) {
                x3 = 1;
            }
            if (full[i] == 2) {
                x2 = 1;
            }
        }

        if (x2 == 1 && x3 == 1)
            pontuacao = 15;
        else pontuacao = 0;
            
    }   
    
    
    public void verfSeguida(){
    
    }
    public void verfQuadrada(){
        
    }
    public void verfGeneral(){
        for(int i=0;i<6;i++){
            
        }
        
        
    }
    
    
}