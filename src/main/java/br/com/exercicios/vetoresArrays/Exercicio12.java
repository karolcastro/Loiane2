package br.com.exercicios.vetoresArrays;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[3];
        int qtdPares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um valor para a posicao: " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            qtdPares += vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("A soma dos numeros digitados é: " + qtdPares);
    }
}
