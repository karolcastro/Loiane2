package br.com.exercicios.loops;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean senhaValida = false;
        String nome;
        String senha;

        do {
            System.out.print(" Digite seu nome de usuario: ");
            nome = scan.next();

            System.out.print(" Digite sua senha: ");
            senha = scan.next();

            if (nome.equalsIgnoreCase(senha)) {
                senhaValida = false;
                System.out.println("Erro - A senha não pode ser igual ao nome, digite novamente: ");
            } else {
                senhaValida = true;
                System.out.println("Senha e usuario valido");
            }
        } while (!senhaValida);
    }
}
