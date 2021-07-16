package br.com.exercicios.loops;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroA;
        int numeroB;

        System.out.println("Digite um numero para A: ");
        numeroA = scan.nextInt();

        System.out.println("Digite um numero para B");
        numeroB = scan.nextInt();

        for(int i = numeroA; i < numeroB; i++){
            System.out.print(" " +i);
        }


    }
}