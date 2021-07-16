package br.com.exercicios.loops;

public class AulaLoops {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("valor de i é: " +i);
        }

        for(;count < 5;) {
            System.out.println("valor de count é: " +count);
            count+=2;
        }

        for(int i=0; count < 10; count +=2){
            System.out.println("valor de count2 é: " +count);
        }

        //sem os {} ele faz a somatoria total
        int soma = 0;
        for(int i = 1; i < 5; soma += i++);
            System.out.println("valor da soma é: " +soma);

    }
}