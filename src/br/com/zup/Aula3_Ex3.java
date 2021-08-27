package br.com.zup;

import java.util.Scanner;

public class Aula3_Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a nota 1: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Insira a nota 2: ");
        double nota2 = leitor.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 & media < 10){
            System.out.println("Aprovado");
        }
        else if (media < 7 & media >= 0 ){
            System.out.println("Reprovado");
        }
        else if (media == 10) {
            System.out.println("Aprovado com distinção");
        }
        else {
            System.out.println("Insira um número válido");
        }
    }
}
