package br.com.exercicios.vetoresArrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        // atribuir os valores
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um numero para a posicao: " + i);
            vetorA[i] = scan.nextInt();
        }

        // atribuir os valor de A para B
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * i;
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();


        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}