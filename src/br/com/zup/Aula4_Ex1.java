package br.com.zup;

import java.util.Scanner;

public class Aula4_Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //armazenando dados do usuario
        System.out.println("Olá! Iremos fazer o cálculo da sua folha de pagamento");
        System.out.println("Por favor nos informe o valor da sua hora de trabalho");
        double valorDaHora = leitor.nextInt();
        System.out.println("Agora nos informe a quantidade de horas trabalhadas");
        double qntHorasTrabalhada = leitor.nextInt();


        //variaveis
        double salarioBruto = valorDaHora * qntHorasTrabalhada;
        double impostoDeRenda = 0;

        //estrutura de decisão

        if (salarioBruto <= 900){
            System.out.println("Você está insento no IR");
        }
        else if (salarioBruto >= 900 & salarioBruto <= 1500){
            impostoDeRenda = salarioBruto * 0.05;
            System.out.println("Seu desconto no IR é de de R$" + impostoDeRenda);
        }
        else if (salarioBruto >= 1500 & salarioBruto <= 2500){
            impostoDeRenda = salarioBruto * 0.1;
            System.out.println("Seu desconto no IR é de R$" + impostoDeRenda);
        }
        else if (salarioBruto >= 2500){
            impostoDeRenda = salarioBruto * 0.2;
            System.out.println("Seu desconto no IR é de R$" + impostoDeRenda);
        }
        // calculando
        double inss = salarioBruto * 0.1;
        double fgts = 0.11;
        double totalDescontos = inss + impostoDeRenda;
        double salarioLiquido = salarioBruto - inss - impostoDeRenda;

        //Visualização da folha de pagamento
        System.out.println("Sua folha de pagamento");
        System.out.printf("\tSalário Bruto: (%.0f * %.0f)\t: R$ %2.f \n", salarioBruto, valorDaHora,qntHorasTrabalhada);
        System.out.println();
        System.out.printf("\t(-) IR  (%s%%)\t\t\t\t: R& %s\n",impostoDeRenda);
        System.out.println();
        System.out.printf("\t(-) INSS  (%%%)\t\t\t\t: R$ %s\n", inss);
        System.out.println();
        System.out.printf("\tFGTS (%%%)\t\t\t\t\t: R$ %s\n", salarioBruto * fgts);
        System.out.println();
        System.out.printf("\tTotal de Descontos\t\t\t\t\t: R$ %s\n", totalDescontos);
        System.out.println();
        System.out.printf("\tSalário Liquído\t\t\t\t\t\t\t: R$ %s\n", salarioLiquido);
    }
}
