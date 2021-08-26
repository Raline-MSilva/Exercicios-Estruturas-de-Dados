package br.com.zup;

import java.util.Scanner;

public class Aula3_Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //criando a estrutura/variaveis

        System.out.println("Digite o preço do Produto 1");
        double produto1 = leitor.nextDouble();
        System.out.println("Digite o preço do Produto 2");
        double produto2 = leitor.nextDouble();
        System.out.println("Digite o preço do Produto 3");
        double produto3 = leitor.nextDouble();

        //criando as condições
        if (produto1 < produto2 & produto1 < produto3){
            System.out.println("Produto 1 é mais barato ");
        }
        else if (produto2 < produto1 & produto2 < produto3){
            System.out.println("Produto2 é mais barato");
        }
        else {
            System.out.println("Produto 3 é mais barato");
        }
    }
}
