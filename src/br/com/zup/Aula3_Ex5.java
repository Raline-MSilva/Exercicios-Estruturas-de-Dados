package br.com.zup;

import java.util.Scanner;

public class Aula3_Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Criando e armazenando
        System.out.println("Digite os valores correspondente ao dia da semana que deseja escolher: ");
        System.out.println("1 para Domingo");
        System.out.println("2 para Segunda");
        System.out.println("3 para Terça");
        System.out.println("4 para Quarta");
        System.out.println("5 para Quinta");
        System.out.println("6 para Sexta");
        System.out.println("7 para Sábado");
        System.out.println("Digite o dia que você deseja");

        //criando as variaveis
        int diaDesejado = leitor.nextInt();
        //usando a estrutura de decisão
        if (diaDesejado == 1){
            System.out.println("O dia escolhido foi Domingo");
        }
        else if (diaDesejado == 2) {
            System.out.println("O dia escolhido foi Segunda");
        }
        else if (diaDesejado == 3) {
            System.out.println("O dia escolhido foi Terça");
        }
        else if (diaDesejado == 4) {
            System.out.println("O dia escolhido foi Quarta");
        }
        else if (diaDesejado == 5) {
            System.out.println("O dia escolhido foi Quinta");
        }
        else if (diaDesejado == 6) {
            System.out.println("O dia escolhido foi Sexta");
        }
        else if (diaDesejado == 7) {
            System.out.println("O dia escolhido foi Sábado");
        }
        else {
            System.out.println("Dia escolhido invalido");
        }
    }
}
