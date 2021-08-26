package br.com.zup;

import java.util.Scanner;

public class Aula3_Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Ex.1 Estrutura de Dados

        System.out.println("Iremos ver pra você qual dos números escolhidos é maior");
        System.out.println("Por favor digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.println("Por favor digite o segundo número:" );
        double numero2 = leitor.nextDouble();

        if (numero1 > numero2){
            System.out.println("O seu número 1 é maior");
        }
        else {
            System.out.println("O seu número 2 é maior");
        }
    }
}
