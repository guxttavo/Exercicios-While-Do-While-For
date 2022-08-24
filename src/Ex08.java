/*
-->Faça um programa que leia 5 números e informe a soma e a média dos números.
*/

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int soma = 0;
        double media;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite 5 números: ");
            num = sc.nextInt();

            soma += num;
        }

        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

    }
}
