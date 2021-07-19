package br.com.exercicios.loops;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroA;
        int numeroB;
        int soma = 0;

        System.out.println("Digite um numero para A: ");
        numeroA = scan.nextInt();

        System.out.println("Digite um numero para B");
        numeroB = scan.nextInt();

        for (int i = numeroA; i <= numeroB; i++) {
            System.out.println(" " + i);
            soma += i;
        }

        System.out.println("A soma dos numeros de A até B é " +soma);
    }
}