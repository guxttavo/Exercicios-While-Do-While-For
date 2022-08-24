/*
-->Altere o programa anterior para mostrar no final a soma dos números.
*/

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int soma = 0;
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                soma += i;
            }
        }

        System.out.println("Soma dos números: " + soma);

    }
}
