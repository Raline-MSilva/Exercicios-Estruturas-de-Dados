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
        double novoSalario;

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
            System.out.println("Insira um salário maior que 0");
        }

        valorDoAumento = salarioAtual * percentualDoAumento;
        novoSalario = salarioAtual + valorDoAumento;

        double valorEmPorcentagemDoAumento = (percentualDoAumento * 100);
        System.out.println("O seu salário atual é de: R$ " + salarioAtual);
        System.out.println("Você receberá " + valorEmPorcentagemDoAumento + "% de aumento");
        System.out.println("O valor do seu aumento será de: R$ " + valorDoAumento);
        System.out.println("O seu novo salário será de: R$ " + novoSalario);
    }
}
