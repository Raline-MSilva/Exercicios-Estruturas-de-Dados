package br.com.zup;

// Trabalhando com estruturas de decisão

import java.util.Scanner;

public class Aula2_Exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos decidir se você pode ou não comprar cerveja");
        System.out.println("Por favor digite sua idade");

        int idadeDoUsuario = leitor.nextInt();

        if (idadeDoUsuario >= 18) {
            System.out.println("Voce pode comprar cerveja");
        }
        else{
            System.out.println("Você é menor de 18 anos, portanto não pode comprar cerveja");
        }
    }
}
