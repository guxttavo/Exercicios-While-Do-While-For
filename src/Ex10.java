/*
-->Faça um programa que receba dois números inteiros e gere os números inteiros que estão
   no intervalo compreendido por eles.
 */

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("O primeiro número precisa ser maior que o segundo!");
        }

    }
}
