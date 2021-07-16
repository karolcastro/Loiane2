package br.com.exercicios.loops;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoPopulacao = false;
        int populacaoA;
        int populacaoB;
        double taxaA;
        double taxaB;
        int contador = 0;


        infoPopulacao = false;
        do {
            System.out.print("Informe a população de A: ");
            populacaoA = scan.nextInt();

            if (populacaoA > 0) {
                infoPopulacao = true;
            } else {
                System.out.print("população precisa ser maior que 0: ");
            }
        }while (!infoPopulacao);

        infoPopulacao = false;
        do {
            System.out.print("Informe a população de B: ");
            populacaoB = scan.nextInt();

            if (populacaoB > 0) {
                infoPopulacao = true;
            } else {
                System.out.print("população precisa ser maior que 0: ");
            }
        }while (!infoPopulacao);

        infoPopulacao = false;
        do {
            System.out.print("Informe a taxa de crescimento da população de A: ");
            taxaA = scan.nextDouble();

            if(taxaA > 0) {
                infoPopulacao =true;
            } else {
                System.out.print("A taxa de crescimento precisa ser maior que 0: ");
            }
        }while (!infoPopulacao);


        infoPopulacao = true;
        do {
            System.out.print("Informe a taxa da população de B: ");
            taxaB = scan.nextDouble();
            if (taxaB > 0) {
                infoPopulacao = true;
            } else {
                System.out.print("A taxa de crescimento precisa ser maior que 0: ");
            }
        }while (!infoPopulacao);

        contador = 0;

            while (populacaoA < populacaoB) {
                infoPopulacao = true;
                populacaoA += (populacaoA/100) *taxaA;
                populacaoB += (populacaoB/100) *taxaB;
                contador++;
            }


        System.out.println("População A: " +populacaoA);
        System.out.println("População A: " +populacaoB);
        System.out.println("Quantidade de anos para a população A passar a população B: " +contador);
    }
}
