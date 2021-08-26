package br.com.zup;

import java.util.Scanner;

public class Aula2_Exemplo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite o seu nome do usuário");
        String nomeDoUsuario = leitor.nextLine();
        System.out.println("Por favor digite sua idade: ");
        int idadeDoUsuario = leitor.nextInt();

        System.out.println ("Seu nome é " + nomeDoUsuario);
        System.out.println("Sua idade é " + idadeDoUsuario);

    }
}
