package br.com.exercicios.loops;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.print("Digite seu nome: ");
            nome = scan.next();

            if (nome.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("Nome inválido é necessáio no mínimo 3 letras, digite novamente");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.print("Digite sua idade: ");
            idade = scan.nextInt();

            if (idade > 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade inválida, digite novamente");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite seu salário: ");
            salario = scan.nextDouble();
            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salário inválido, digite novamente");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite seu sexo f ou m: ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Sexo inválido, digite seu sexo f ou m: ");

            }
        } while (!infoValida) ;

            infoValida = false;
            do {
                System.out.println("Digite seu estado civil (s, c, v, d): ");
                estadoCivil = scan.next();

                if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") ||
                        estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                    infoValida = true;
                }else {
                    System.out.println("Estado civil incorreto, digite seu estado civil (s, c, v, d): ");
                }
            } while (!infoValida);

        System.out.println("As informações digitadas foram:  ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        }
    }

