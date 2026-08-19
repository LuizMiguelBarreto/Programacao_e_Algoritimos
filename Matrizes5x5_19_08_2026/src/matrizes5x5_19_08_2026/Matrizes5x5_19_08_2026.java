/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizes5x5_19_08_2026;

/**
 *
 * @author Luiz miguel
 */
public class Matrizes5x5_19_08_2026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Atividade de Matrix 5x5 19/08/2026
        
        //Declaração da Matrix A
        int[][] A = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13 ,14 , 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23 ,24 , 25},
        };
        
        //Declaração da Matrix B
        int[][] B = {
            {2, 4, 6, 8, 10},
            {12, 14, 16, 18, 20},
            {22, 24, 26 ,28 , 30},
            {32, 34, 36, 38, 40},
            {42, 44, 46 ,48 , 50},
        };
        
        //Declaração da Matrix CA que armazenará o resultado da adição da Matrix A com a Matrix B
        int[][] CA = new int [5][5];
        
        //Declaração da Matrix CS que armazenará o resultado da subtração da Matrix A com a Matrix B
        int[][] CS = new int [5][5];
        
        //Declaração da Matrix CD que armazenará o resultado da divisão da Matrix A com a Matrix B
        double[][] CD = new double [5][5];
        
        //Calculo da Adição
        //Pecorre as Linhas das Matrizes
        for(int i = 0;i<5;i++){
            //Pecorre as Colunas das Matrizes
            for(int j = 0;j<5;j++){
                // Os Elementos dentro da Matrix CA vai ser o resultado de Matrix A + Matrix B
                CA[i][j] = A[i][j] + B[i][j];  
            }
        }
        
        //Calculo da Subtração
        //Pecorre as Linhas das Matrizes
        for (int i = 0;i < 5;i++){
            //Pecorre as Colunas das Matrizes
            for(int j = 0;j < 5;j++){
              // Os Elementos dentro da Matrix CA vai ser o resultado de Matrix A - Matrix B
              CS[i][j] = A[i][j] - B[i][j];  
            }
        }
        
        //Calculo da Divisão
        //Pecorre as Linhas das Matrizes
        for (int i = 0;i < 5;i++){
            //Pecorre as Colunas das Matrizes
            for(int j = 0;j < 5;j++){
                // Na hora da visão vai ser verificado se o divisor é diferente de zero
                if(B[i][j] != 0){
                    // Caso for diferente , Elementos resultantes da Divisão de Matrix A / Matrix B vai ser colocado normalmente na Matrix CD
                   CD[i][j] = (double) A[i][j] / B[i][j]; 
                }
                else{
                    // Caso for Igual, Uma menssagem de Erro vai aparecer e Indica a posição do erro
                    System.out.println("Não Foi possivel fazer a divisao por 0 na posição [" + i + "] [" + j + "]"  );
                }
            }
        }
        
        //Exibição da Matriz A
        System.out.println("Matriz A");
        for(int i = 0;i < 5;i++){
            for(int j = 0;j < 5;j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        
        //Exibição da Matriz B
        System.out.println("\nMatriz B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }
        //Exibição da Matriz CA
        System.out.println("\nMatriz C Com Operacao de Adicao:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(CA[i][j] + "\t");
            }
            System.out.println();
        }
        //Exibição da Matriz CS
        System.out.println("\nMatriz C Com Operacao de Subtracao:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(CS[i][j] + "\t");
            }
            System.out.println();
        }
        
        //Exibição da Matriz CD
        System.out.println("\nMatriz C Com Operacao de Divisao:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(CD[i][j] + "\t");
            }
            System.out.println();
        }
        
        
       
        
    }
    
}
