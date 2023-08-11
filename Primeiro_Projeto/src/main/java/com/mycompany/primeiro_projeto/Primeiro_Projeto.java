/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiro_projeto;

import java.util.Scanner;

/**
 *
 * @author jeuvi
 */
public class Primeiro_Projeto {

    public static void main(String[] args) {
      //Atividade 1 de Vetores
      /*  int[] casas = new int[10];
        int total =1;
        casas[0]=1;
        for (int i = 1; i <casas.length; i++) {
                casas[i] = casas[i-1] * 2;
                total += casas[i]; }
                
        for (int i = 0; i<casas.length; i++)
            System.out.println("Casa "+ (i+1)+" Qtd de itens: "+ casas[i] + ", ");
        System.out.println("Total de itens: "+total); */
        
        //Atividade 2 de Vetores
        /*
        int [] vetor = {2, 4, 35, 50, 23, 17, 9, 12, 27, 5};
        int menor =0; int maior =0;
        for (int i = 0; i < vetor.length; i++)
            if (maior < vetor[i])
                maior = vetor[i];
        
        menor = maior;
        for (int i = 0; i < vetor.length; i++)
            if (menor > vetor[i])
                menor = vetor[i];
                
        System.out.println("O maior valor: "+ maior);
        System.out.println("O Menor valor:  "+menor);
        
        */
        
        //Atividade 1 de Matrizes 
        /*
        int [] [] m2x2 = new int[2][2];
        int contador = 0;
        for(int i=0; i <2; i++ ) {
            for(int j=0; j <2; j++) {
                contador ++;
                m2x2[i][j]= contador;
            }
        }
      System.out.println("|----|");
        for(int i=0; i <2; i++ ) {
            System.out.print("|");
            for(int j=0; j <2; j++) {
                System.out.print(m2x2[i][j] + " ");
            }
            System.out.print("|");
            System.out.println(" ");
        }
        System.out.println("|----|");
        */
        //Atividade 2 de Matrizes
        int[][] m3x3 = new int[3][3];
        Scanner readline = new Scanner(System.in);
        for (int i =0; i <3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Digite o numero para a coluna "+ i+ " e linha "+j);
                m3x3 [i][j] = readline.nextInt();
            }                
        }
        for (int i =0; i <3; i++) {
            System.out.println(" ");
            for(int j=0; j<3; j++){
                System.out.print(m3x3[i][j] + " ");
            }
        }

        }
}
