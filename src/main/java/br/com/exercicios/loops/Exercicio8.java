package br.com.exercicios.loops;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int media;

        for(int i =0;  i < 5; i++){

            System.out.println("Digite 5 numeros aleatórios: ");
            numero = scan.nextInt();

            soma += numero;
        }
        media = soma /5;

        System.out.println("A soma é: " +soma);
        System.out.println("A média é: " +media);
    }
}