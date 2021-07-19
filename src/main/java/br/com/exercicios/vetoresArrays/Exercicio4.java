package br.com.exercicios.vetoresArrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        double[] vetorB = new double[vetorA.length];

        // atribuir os valores
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um numero para a posicao: " + i);
            vetorA[i] = scan.nextInt();
        }

        // atribuir os valor de A para B
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }
        System.out.println();
    }
}