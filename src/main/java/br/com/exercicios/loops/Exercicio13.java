package br.com.exercicios.loops;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a base: ");
        int base = entrada.nextInt();

        System.out.println("Entre com a potência: ");
        int potencia = entrada.nextInt();

        int resultado = base;

        for(int i =1; i<potencia;i++) {
            resultado *= base;
        }


        System.out.println("Resultado: " + resultado);
    }
}
