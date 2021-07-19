package br.com.exercicios.breakContinue;

import java.util.Scanner;

// Exemplo 1  -  mostrar o primeiro numero divisivel por 7 entre o numero digitado e o maximo informado com o break.
// não mostrar o primeiro numero divisivel por 7 entre o numero digitado e o maximo informado com o break.

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número");
        int numero = scan.nextInt();

        System.out.println("Entre com o limite");
        int maximo = scan.nextInt();

        /*for(int i =numero; i< maximo; i++) {
            if(i % 7 == 0){
                System.out.println("O valor de i é: " +i);
                break;
            }
        }*/
        for (int i = numero; i <= maximo; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
    }
}