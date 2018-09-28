/*
 * Classe que inclui as fraquezas de cada tipo de pokemon.
 * 0-Sem tipo(caso de tipo unico); 1-Normal; 2-Fogo; 3-Lutador; 4-Agua; 5-Voador; 6-Grama; 7-Veneno; 8-Eletrico; 
 * 9-Terrestre; 10-Psiquico; 11-Rocha; 12-Gelo; 13-Inseto; 14-Dragao; 15-Fantasma; 16-Noturno; 
 * 17-Aco; 18-Fada
 */
// {1,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18}

// {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}

package pokemonrandomizerbattle;

/**
 *
 * @author Marcus
 */
public class Tipo {
    double fraquezas[];
    String nome;
    int id;

    public Tipo(int id) {
        
        this.id = id;
        switch(id){
            case 0:
                nome = "-----";
                fraquezas = new double[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
                break;
            case 1:
                nome = "Normal";
                fraquezas = new double[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1};
                break;
            case 2:
                nome = "Fogo";
                fraquezas = new double[] {1,1,0.5,1,2,1,0.5,1,1,2,1,2,0.5,0.5,1,1,1,0.5,0.5};
                break;
            case 3:
                nome = "Lutador";
                fraquezas = new double[] {1,1,1,1,1,2,1,1,1,1,2,0.5,1,0.5,1,1,0.5,1,2};
                break;
            case 4:
                nome = "Agua";
                fraquezas = new double[] {1,1,0.5,1,0.5,1,2,1,2,1,1,1,0.5,1,1,1,1,2,1};
                break;
            case 5:
                nome = "Voador";
                fraquezas = new double[] {1,1,1,0.5,1,1,0.5,1,2,0,1,2,2,0.5,1,1,1,1,1};
                break;
            case 6:
                nome = "Grama";
                fraquezas = new double[] {1,1,2,1,0.5,2,0.5,2,0.5,0.5,1,1,2,2,1,1,1,1,1};
                break;
            case 7:
                nome = "Veneno";
                fraquezas = new double[] {1,1,1,0.5,1,1,0.5,0.5,1,2,2,1,1,0.5,1,1,1,1,0.5};
                break;
            case 8:
                nome = "Eletrico";
                fraquezas = new double[] {1,1,1,1,1,0.5,1,1,0.5,2,1,1,1,1,1,1,1,0.5,1};
                break;
            case 9:
                nome = "Terrestre";
                fraquezas = new double[] {1,1,1,3,2,1,2,0.5,0,1,1,0.5,2,1,1,1,1,1,1};
                break;
            case 10:
                nome = "Psiquico";
                fraquezas = new double[] {1,1,1,0.5,1,1,1,1,1,1,0.5,1,1,2,1,2,2,1,1};
                break;
            case 11:
                nome = "Rocha";
                fraquezas = new double[] {1,0,5,0,5,2,2,0,5,2,0,5,1,2,1,1,1,1,1,1,1,2,1};
                break;
            case 12:
                nome = "Gelo";
                fraquezas = new double[] {1,1,2,2,1,1,1,1,1,1,1,2,0.5,1,1,1,1,2,1};
                break;
            case 13:
                nome = "Inseto";
                fraquezas = new double[] {1,1,2,0.5,1,2,0.5,1,1,0.5,1,2,1,1,1,1,1,1,1};
                break;
            case 14:
                nome = "Dragao";
                fraquezas = new double[] {1,1,0.5,1,0.5,1,0.5,1,0.5,1,1,1,2,1,2,1,1,1,2};
                break;
            case 15:
                nome = "Fantasma";
                fraquezas = new double[] {1,0,1,0,1,1,1,0.5,1,1,1,1,11,0.5,1,2,2,1,1};
                break;
            case 16:
                nome = "Noturno";
                fraquezas = new double[] {1,1,1,2,1,1,1,1,1,1,0,1,1,2,1,0.5,0.5,1,1};
                break;
            case 17:
                nome = "Aco";
                fraquezas = new double[] {1,0.5,2,2,1,0.5,0.5,0,1,2,0.5,0.5,0.5,0.5,0.5,1,1,0.5,0.5};
                break;
            case 18:
                nome = "Fada";
                fraquezas = new double[] {1,1,1,0.5,1,1,1,2,1,1,1,1,1,0.5,0,1,0.5,2,1};
                break;            
        }
    }
}
