/*
-->Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de
   3% e que a população de B, seja 200.000 habitantes com uma taxa de crescimento de 1.5%.
-->Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse
   ou iguale a população do país B, mantidas as taxas de crescimento.
 */

public class Ex04 {

    public static void main(String[] args) {

        double popA = 80.000;
        double popB = 200.000;
        int count = 0;

        while (popA < popB) {

            popA += (popA / 100) * 3;
            popB += (popA / 100) * 1.5;
            count++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Anos: " + count);


    }
}
