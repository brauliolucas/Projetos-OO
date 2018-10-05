/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoexceção;

/**
 *
 * @author ice
 */
public class Calc {

    public static float divisao(int a, int b) {
        float x=0;
        try {
            x = a / b;
        }catch (ArithmeticException e) {
            System.out.println("Erro : " + e.getMessage());
        }
        return x;
    }
    
    
    
    
    public static void vet() {
        int[] vetor = new int[4];
        for (int i = 0; i < 5; i++) {
            try {

                vetor[i] = i + 1;
                int x = vetor[i] / 0;

            } catch (Exception e) {
                System.out.println("Erro : " + e.getMessage());
            }

        }

    }

}