package br.com.exercicios.loops;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maiorNumero = Integer.MIN_VALUE;

        for(int i =0;  i < 5; i++){

            System.out.println(" Digite 5 numeros aleatórios: ");
            numero = scan.nextInt();

            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        System.out.println("O maior numero digitado é: " +maiorNumero);
    }
}