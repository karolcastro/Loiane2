package br.com.exercicios.vetoresArrays;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        // atribuir os valores
        for(int i =0; i < vetorA.length; i++) {
            System.out.println("Digite um numero para a posicao: " +i);
            vetorA[i] = scan.nextInt();
        }

        // atribuir os valor de A para B
        for(int i =0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
        }

        System.out.println("Vetor A = ");
        for(int i =0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for(int i =0; i < vetorB.length; i++) {
            System.out.println(vetorB[i] + " ");
        }
        System.out.println();

    }
}