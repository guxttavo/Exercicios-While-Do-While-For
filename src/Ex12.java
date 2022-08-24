/*
-->Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
   inteiro entre 1 e 10. O usuário deve informar de qual número ele deseja ver a
   tabuada.
 */

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número para gerar a tabuada: ");
        int num = sc.nextInt();

        System.out.println("Tabuada de: " + num);
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }


    }
}
