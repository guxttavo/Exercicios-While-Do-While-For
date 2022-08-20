/*
-->Altere o programa da questão 04, permitindo ao usuário informar as populações
   e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação
 */

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean valido = false;

        double popA;
        double popB;
        double taxaCresA;
        double taxaCresB;
        int count = 0;


        System.out.println("População B: ");
        popB = sc.nextDouble();
        System.out.println("Taxa de crescimento população B: ");
        taxaCresB = sc.nextDouble();

        do {
            System.out.println("População A: ");
            popA = sc.nextDouble();

            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("População precisa ser maior que 0");
            }

            System.out.println("Taxa de crescimento população A: ");
            taxaCresA = sc.nextDouble();


            if (taxaCresA > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de crescimento precisa ser maior que 0");
            }

        }
        while (!valido);


        valido = false;

        do {
            System.out.println("População B: ");
            popB = sc.nextDouble();

            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("População precisa ser maior que 0");
            }

            System.out.println("Taxa de crescimento população B: ");
            taxaCresB = sc.nextDouble();

            if (taxaCresB > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de crescimento precisa ser maior que 0");
            }

        }
        while (!valido);

        while (popA < popB) {

            popA += (popA / 100) * taxaCresA;
            popB += (popB / 100) * taxaCresB;
            count++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Anos: " + count);


    }
}
