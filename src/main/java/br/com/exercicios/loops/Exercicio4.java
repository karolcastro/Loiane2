package br.com.exercicios.loops;

public class Exercicio4 {
    public static void main(String[] args) {

        int populacaoA = 80000;
        int populacaoB = 200000;
        int contador = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA/100) *3;
            populacaoB += (populacaoB/100) *1.5;
            contador++;
        }
        System.out.println("População A: " +populacaoA);
        System.out.println("População A: " +populacaoB);
        System.out.println("Quantidade de anos para a população A passar a população B: " +contador);
    }
}