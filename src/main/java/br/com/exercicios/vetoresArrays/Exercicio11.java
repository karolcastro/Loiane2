package br.com.exercicios.vetoresArrays;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdPares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um valor para a posição " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                qtdPares++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de numeros pares digitados é: " + qtdPares);
    }
}