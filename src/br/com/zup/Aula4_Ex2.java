package br.com.zup;

import java.util.Scanner;

public class Aula4_Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valorTotal = 0;
        double valorDoDesconto = 0;

        System.out.println("Seja Bem vindo ao Posto de Combustivel");
        System.out.println("Por favor, digite G para gasolina e A para alcool");

        String tipoCombustivel = leitor.nextLine();
        System.out.println("Digite o valor em L do quanto você quer abastecer: ");

        double valorEmL = leitor.nextDouble();

        if (tipoCombustivel.equals("G") | tipoCombustivel.equals("g")) {
            valorTotal = valorEmL * 2.5; // o quanto a pessoa vai ter que pagar

            if (valorEmL <= 20 & valorEmL > 0) {
                // calcular o desconto de < 20L
                valorDoDesconto = (0.04 * valorTotal);
            } else {
                // Calcular o desconto de > 20L
                valorDoDesconto = (0.06 * valorTotal);
            }
        } else if (tipoCombustivel.equals("A") | tipoCombustivel.equals("a")) {
            valorTotal = (valorEmL * 1.9);

            if (valorEmL <= 20 & valorEmL > 0) {
                //calcular o desconto de < 20L
                valorDoDesconto = (0.03 * valorTotal);
            } else {
                // Calcular o desconto > 20L
                valorDoDesconto = (0.05 * valorTotal);
            }
        }
        // exibindo as informações
        System.out.println("Você precisará pagar: ");
        double valorTotalComDesconto = valorTotal - valorDoDesconto;
        System.out.print(" R$ " + valorTotalComDesconto);
    }
}
