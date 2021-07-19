package br.com.exercicios.vetoresArrays;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[4];
        int impar =0;
        int soma =0;
        int media =0;

        for(int i =0; i < vetorA.length; i++) {
            System.out.println("Digite um valor para A " +i);
            vetorA[i] = scan.nextInt();
        }

        for(int i =0; i < vetorA.length; i++) {
            if(vetorA[i] % 2 != 0){
                soma += vetorA[i];
                impar++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("A soma dos numeros informados é de: " + soma);
        System.out.println("A média dos numeros informados é de: " + (soma/impar));
    }
}