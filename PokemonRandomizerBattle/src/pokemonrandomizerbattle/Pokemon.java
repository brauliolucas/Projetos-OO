/*
 * Classe que contem os dados dos pokemons e os randomiza de acordo com o tipo selecionado
 * 
 */
package pokemonrandomizerbattle;

import java.util.Random;

/**
 *
 * @author Marcus
 */
public class Pokemon {
    private String nome;
    private int hp;
    private int atk;
    private int spAtk;
    private int def;
    private int spDef;
    private int velocidade;
    public Tipo tipo1;
    public Tipo tipo2;
    public Movimento moves[];

    public Pokemon(int tipo) {
        switch(tipo){
            case 1:
                randomNormal();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
//              "Inseto";
                break;
            case 14:
//              "Dragao";
                break;
            case 15:
//                "Fantasma";
                break;
            case 16:
//                 "Noturno";
                break;
            case 17:
//                "Aco";
                break;
            case 18:
//                "Fada";
                break; 
    }
    
  
    
    
    
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // 1-Normal; 2-Fogo; 3-Lutador; 4-Agua; 5-Voador; 6-Grama; 7-Veneno; 8-Eletrico;
// 9-Terrestre; 10-Psiquico; 11-Rocha; 12-Gelo; 13-Inseto; 14-Dragao; 15-Fantasma; 16-Noturno; 
// 17-Aco; 18-Fada
// Contrutor de movimento: int precisao, int danoBase, String nome, int tipo, boolean moveFisico
    public void randomNormal(){
        Random s = new Random();
        int select = s.nextInt(6);
        switch(select){
            case 0:
                nome = "Persian";
                hp = 271;
                atk = 158;
                spAtk = 229;
                def = 157;
                spDef = 166;
                velocidade = 361;
                tipo1 = new Tipo(1);
                tipo2 = new Tipo(0);
                moves[0] = new Movimento(100,90,"Hiper Voz",1,false);
                moves[1] = new Movimento(100,80,"Bola Negra",15,false);
                moves[2] = new Movimento(100,60,"Pulso Dagua",4,false);
                moves[3] = new Movimento(100,90,"Choque do Trovao",8,false);
                break;
            case 1:
                nome = "Snorlax";
                hp = 461;
                atk = 350;
                spAtk = 149;
                def = 166;
                spDef = 309;
                velocidade = 107;
                tipo1 = new Tipo(1);
                tipo2 = new Tipo(0);
                moves[0] = new Movimento(100,100,"Retorno",1,true);
                moves[1] = new Movimento(100,100,"Terremoto",9,true);
                moves[2] = new Movimento(100,80,"Bomba de Sementes",6,true);
                moves[3] = new Movimento(90,80,"Cabecada Zen",10,true);
                break;
            case 2:
                nome = "Porygon-Z";
                hp = 311;
                atk = 176;
                spAtk = 405;
                def = 176;
                spDef = 187;
                velocidade = 279;
                tipo1 = new Tipo(1);
                tipo2 = new Tipo(0);
                moves[0] = new Movimento(100,80,"Tri Ataque",1,false);
                moves[1] = new Movimento(100,90,"Rajada de Gelo",12,false);
                moves[2] = new Movimento(100,90,"Choque do Trovao",8,false);
                moves[3] = new Movimento(100,80,"Psichoque",10,false);
                break;
            case 3:
                nome = "Bewear";
                hp = 382;
                atk = 383;
                spAtk = 131;
                def = 196;
                spDef = 156;
                velocidade = 219;
                tipo1 = new Tipo(1);
                tipo2 = new Tipo(3);
                moves[0] = new Movimento(100,100,"Retorno",1,true);
                moves[1] = new Movimento(80,100,"Braco de Martelo",3,true);
                moves[2] = new Movimento(100,75,"Soco de Gelo",12,true);
                moves[3] = new Movimento(100,100,"Terremoto",9,true);
                break;
            case 4:
                nome = "Bibarel";
                hp = 299;
                atk = 295;
                spAtk = 131;
                def = 157;
                spDef = 156;
                velocidade = 241;
                tipo1 = new Tipo(1);
                tipo2 = new Tipo(4);
                moves[0] = new Movimento(100,100,"Retorno",1,true);
                moves[1] = new Movimento(80,100,"Cachoeira",4,true);
                moves[2] = new Movimento(70,120,"Superpoder",3,true);
                moves[3] = new Movimento(80,100,"Triturar",16,true);
                break;
            case 5:
                nome = "Silvally";
                hp = 331;
                atk = 226;
                spAtk = 289;
                def = 226;
                spDef = 227;
                velocidade = 289;
                tipo1 = new Tipo(1);
                tipo2 = new Tipo(0);
                moves[0] = new Movimento(100,90,"Hiper Voz",1,false);
                moves[1] = new Movimento(100,80,"Bola Negra",15,false);
                moves[2] = new Movimento(100,90,"Surfar",4,false);
                moves[3] = new Movimento(100,90,"Lanca-chamas",2,false);
                break;
            case 6:
                nome = "Arceus";
                hp = 441;
                atk = 372;
                spAtk = 248;
                def = 276;
                spDef = 276;
                velocidade = 280;
                tipo1 = new Tipo(1);
                tipo2 = new Tipo(0);
                moves[0] = new Movimento(100,100,"Julgamento",1,true);
                moves[1] = new Movimento(100,100,"Terremoto",9,true);
                moves[2] = new Movimento(80,100,"Lamina de Pedra",11,true);
                moves[3] = new Movimento(100,80,"Tesoura-X",13,true);
                break;
        }   
    }
}
