package br.com.zup;

import java.util.Scanner;

public class Aula3_Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //armazenando dados do usuario
        System.out.println("Insira por favor o seu salário: ");
        double salarioAtual = leitor.nextDouble();
        double percentualDoAumento = 0;
        double valorDoAumento = 0;
        double novoSalario = valorDoAumento;

        if (salarioAtual > 0 & salarioAtual <= 280){
            System.out.println("Você recebeu aumento de 20%");
            novoSalario = salarioAtual * 0.02;
        }
        else if (salarioAtual > 280 & salarioAtual <= 700){
            System.out.println("Você recebeu um aumento de 15%");
            novoSalario = salarioAtual * 0.015;
        }
        else if (salarioAtual > 700 & salarioAtual <= 1500){
            System.out.println("Você recebeu um aumento de 10%");
            novoSalario = salarioAtual * 0.01;
        }
        else if (salarioAtual > 1500){
            System.out.println("Você recebeu aumento de 5%");
            novoSalario = salarioAtual * 0.05;
        }
        else {
            System.out.println("Insira um valor válido");
        }
        System.out.println("Salário antes do reajuste: " + salarioAtual);
        System.out.println("O valor do seu aumento: " + percentualDoAumento * 100);
        System.out.println("Salário após o aumento: " + novoSalario);
    }
}
