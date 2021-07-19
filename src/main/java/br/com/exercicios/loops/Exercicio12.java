package br.com.exercicios.loops;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int contador = 0;

        System.out.println("Entre com a tabuada que deseja ver: ");
        numero = entrada.nextInt();

        for(int i =0; i <=10; i++) {
            System.out.println(numero + "X" + i + "= " + (numero*i));
        }

        /*while (contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + "X" + contador + "= " + resultado);
            contador ++;
        }*/
    }
}