/*
-->Faça um programa que peça uma nota, entre zero e dez.
-->Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o
   usuário informe um valor válido.

*/

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Entre com uma nota: ");

            double nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                System.out.println("Nota inválida, digite novamente.");
            }

        } while (!notaValida);
    }
}
