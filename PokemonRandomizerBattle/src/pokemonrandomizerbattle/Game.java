/*
 * Classe do Jogo
 *
 */
package pokemonrandomizerbattle;



import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Marcus
 */
public class Game {
    Pokemon poke1;
    Pokemon poke2;

    public Game() {
        System.out.println("-------------Batalha Randomizada Pokemon-------------");
        System.out.println("Regras: Apenas um pokemon por jogador, randomizado por tipo.");
        System.out.println("Tipos: 1-Normal; 2-Fogo; 3-Lutador; 4-Agua; 5-Voador; 6-Grama; 7-Veneno; 8-Eletrico;");
        System.out.println("9-Terrestre; 10-Psiquico; 11-Rocha; 12-Gelo; 13-Inseto; 14-Dragao; 15-Fantasma; 16-Noturno; .");
        System.out.println("Jogador 1: Digite o tipo ou, alheio a este, sera aleatorio");
        Scanner s = new Scanner(System.in);
        int select = s.nextInt();
        Random gerador = new Random();
        if(select<1 || select>18){
            select = gerador.nextInt(18);
            if(select==0){
                select=1;
            }
        }
        poke1 = new Pokemon(select);
        System.out.println("Jogador 2: Digite o tipo ou, alheio a este, sera aleatorio");
        s = new Scanner(System.in);
        select = s.nextInt();
        gerador = new Random();
        if(select<1 || select>18){
            select = gerador.nextInt(18);
            if(select==0){
                select=1;
            }
        }
        poke2 = new Pokemon(select);
    }


    public boolean checkHP(Pokemon poke1, Pokemon poke2){

        if(poke1.getHp() > 0 && poke2.getHp() > 0){
            return true;
        }
        else
            return false;

    }

    public void alteraHp(int dano, Pokemon poke){
        poke.setHp((poke.getHp()-dano));

    }

    public Movimento geraMovimento(Pokemon poke){
        Random gerador = new Random();
        gerador.nextInt(5);

        return poke.moves[gerador];

    }


}

    