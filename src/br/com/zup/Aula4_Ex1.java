package br.com.zup;

import java.util.Scanner;

public class Aula4_Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //criando as variaveis e armazenando
        System.out.println("Olá! Iremos fazer o cálculo da sua folha de pagamento");
        System.out.println("Por favor nos informe o valor da sua hora de trabalho");
        double valorDaHora = leitor.nextInt();
        System.out.println("Agora nos informe a quantidade de horas trabalhadas");
        int qntHorasTrabalhada = leitor.nextInt();


        //calculo das horas e dos descontos
        double salarioBruto = valorDaHora * qntHorasTrabalhada;
        double descontos = salarioBruto * (0.10 + 0.11);
        double impostoDeRenda;
        double salarioLiquido = salarioBruto - descontos;

        //estrutura de decisão

        if (salarioBruto <= 900){
            System.out.printf("Insento");
        }
        else if (salarioBruto <= 1500){
            System.out.println("Desconto de 5%");
        }
        else if (salarioBruto <= 2500){
            System.out.println("Desconto de 10%");
        }




    }
}
