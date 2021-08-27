package br.com.zup;

import java.util.Scanner;

public class Aula3_Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o salário: ");
        double salario = leitor.nextDouble();

        if (salario > 280 & salario <= 700){
            System.out.println("Recebem aumento de 15%");
        }
    }
}
