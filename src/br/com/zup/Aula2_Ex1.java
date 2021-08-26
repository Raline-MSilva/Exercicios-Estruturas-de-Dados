package br.com.zup;

import java.util.Scanner;

public class Aula2_Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite a nota do aluno");
        double notaDoAluno = leitor.nextDouble();

        if (notaDoAluno < 6) {
            System.out.println("Voce foi reprovado com a nota: " + notaDoAluno);
        }

    }
}
