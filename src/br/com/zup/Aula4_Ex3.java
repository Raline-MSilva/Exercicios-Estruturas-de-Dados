package br.com.zup;

import java.util.Scanner;

public class Aula4_Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Exibir as perguntas e armazenar as respostas
        int contadorDeRespostas = 0;

        System.out.println("Olá! Irei lhe fazer algumas perguntas");
        System.out.println("Digite s para sim e n para não");

        //usando a estrutura de decisao para o java contar as respostas
        System.out.println("Telefonou para a vítima?");
        String respostas = leitor.nextLine();
        if (respostas.equals("s")) {
            contadorDeRespostas = contadorDeRespostas + 1;
        }
        System.out.println("Esteve no local do crime?");
        respostas = leitor.nextLine();

        if (respostas.equals("s")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }
        System.out.println("Mora perto da vítima?");
        respostas = leitor.nextLine();

        if (respostas.equals("s")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }
        System.out.println("Devia para a vítima?");
        respostas = leitor.nextLine();

        if (respostas.equals("s")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }
        System.out.println("Já trabalhou com a vítima?" );
        respostas = leitor.nextLine();

        //agora estou criando uma nova estrutura de decisão para saber a resposta
        if (contadorDeRespostas == 2) {
            System.out.println("Suspeita");
        }
        else if (contadorDeRespostas == 3 | contadorDeRespostas == 4) {
            System.out.println("Cúmplice");
        }
        else if (contadorDeRespostas == 5) {
            System.out.println("Assassino");
        }
        else {
            System.out.println("Desculpe o incômodo, você é inocente!");
        }

    }
}
